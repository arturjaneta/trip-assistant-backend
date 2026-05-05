#!/bin/sh

# Convert Render's DATABASE_URL (postgresql://user:pass@host:port/db)
# to JDBC format (jdbc:postgresql://host:port/db)
if [ -n "$DATABASE_URL" ]; then
  # Strip credentials from URL and prepend jdbc:
  JDBC_URL=$(echo "$DATABASE_URL" | sed 's|postgresql://[^@]*@|jdbc:postgresql://|')
  export DATABASE_URL="$JDBC_URL"
fi

exec java -jar /app/app.jar

