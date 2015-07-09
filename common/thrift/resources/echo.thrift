namespace java org.darion.yaphet.echo

struct message {
   1: required string key,
   2: required string val,
}


service Echo {
   string echo(1: message m)
}
