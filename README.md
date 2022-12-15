## Démarrer l'API manuellement

## Base de données
### Creation de la base de données
```
CREATE USER tpiapipaiment WITH PASSWORD 'tpiapipaiment';
CREATE DATABASE tpiapipaiment;
GRANT CREATE ON DATABASE tpiapipaiment TO tpiapipaiment;
ALTER USER tpiapipaiment WITH SUPERUSER;
\connect tpiapipaiment;
create schema tpiapipaiment authorization tpiapipaiment;
GRANT ALL PRIVILEGES ON DATABASE tpiapipaiment to tpiapipaiment;
```

### Creation de la base de test postgres

```
CREATE DATABASE tpiapipaimenttest;
GRANT CREATE ON DATABASE tpiapipaimenttest TO tpiapipaiment;
\connect tpiapipaimenttest;
create schema tpiapipaiment authorization tpiapipaiment;
```
