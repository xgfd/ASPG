self=$0
sh execQ.sh -H 'Accept: text/csv' -G "${1?SPARQL endpoint is required}" ./queries/${self%%.*}.rq ${2?Two URIs are required} ${3?Two URIs are required}