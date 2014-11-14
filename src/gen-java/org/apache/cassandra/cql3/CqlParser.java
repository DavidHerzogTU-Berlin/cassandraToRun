// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g 2014-11-01 11:28:11

    package org.apache.cassandra.cql3;

    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.Collections;
    import java.util.EnumSet;
    import java.util.HashMap;
    import java.util.LinkedHashMap;
    import java.util.List;
    import java.util.Map;
    import java.util.Set;

    import org.apache.cassandra.auth.Permission;
    import org.apache.cassandra.auth.DataResource;
    import org.apache.cassandra.auth.IResource;
    import org.apache.cassandra.cql3.*;
    import org.apache.cassandra.cql3.statements.*;
    import org.apache.cassandra.cql3.functions.FunctionCall;
    import org.apache.cassandra.db.marshal.CollectionType;
    import org.apache.cassandra.exceptions.ConfigurationException;
    import org.apache.cassandra.exceptions.InvalidRequestException;
    import org.apache.cassandra.exceptions.SyntaxException;
    import org.apache.cassandra.utils.Pair;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CqlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "K_USE", "K_SELECT", "K_COUNT", "K_AS", "K_FROM", "K_WHERE", "K_ORDER", "K_BY", "K_LIMIT", "K_ALLOW", "K_FILTERING", "K_WRITETIME", "K_TTL", "INTEGER", "K_AND", "K_ASC", "K_DESC", "K_INSERT", "K_INTO", "K_VALUES", "K_USING", "K_TIMESTAMP", "K_UPDATE", "K_SET", "K_IF", "K_NOT", "K_EXISTS", "K_DELETE", "K_BEGIN", "K_UNLOGGED", "K_COUNTER", "K_BATCH", "K_APPLY", "K_CREATE", "K_KEYSPACE", "K_WITH", "K_COLUMNFAMILY", "K_PRIMARY", "K_KEY", "K_COMPACT", "K_STORAGE", "K_CLUSTERING", "K_CUSTOM", "K_INDEX", "IDENT", "K_ON", "STRING_LITERAL", "K_TRIGGER", "K_DROP", "K_ALTER", "K_TYPE", "K_ADD", "K_RENAME", "K_TO", "K_TRUNCATE", "K_GRANT", "K_REVOKE", "K_LIST", "K_OF", "K_NORECURSIVE", "K_MODIFY", "K_AUTHORIZE", "K_ALL", "K_PERMISSIONS", "K_PERMISSION", "K_KEYSPACES", "K_USER", "K_SUPERUSER", "K_NOSUPERUSER", "K_USERS", "K_PASSWORD", "QUOTED_NAME", "FLOAT", "BOOLEAN", "UUID", "HEXNUMBER", "K_NULL", "QMARK", "K_TOKEN", "K_IN", "K_ASCII", "K_BIGINT", "K_BLOB", "K_BOOLEAN", "K_DECIMAL", "K_DOUBLE", "K_FLOAT", "K_INET", "K_INT", "K_TEXT", "K_UUID", "K_VARCHAR", "K_VARINT", "K_TIMEUUID", "K_MAP", "S", "E", "L", "C", "T", "F", "R", "O", "M", "A", "W", "H", "N", "D", "K", "Y", "I", "U", "P", "G", "B", "X", "V", "Z", "J", "Q", "DIGIT", "LETTER", "HEX", "EXPONENT", "WS", "COMMENT", "MULTILINE_COMMENT", "';'", "'('", "')'", "','", "'\\*'", "'['", "']'", "'.'", "'}'", "':'", "'{'", "'='", "'+'", "'-'", "'<'", "'<='", "'>'", "'>='"
    };
    public static final int EXPONENT=128;
    public static final int K_PERMISSIONS=67;
    public static final int LETTER=126;
    public static final int K_INT=92;
    public static final int K_PERMISSION=68;
    public static final int K_CREATE=37;
    public static final int K_CLUSTERING=45;
    public static final int K_WRITETIME=15;
    public static final int K_EXISTS=30;
    public static final int EOF=-1;
    public static final int K_PRIMARY=41;
    public static final int K_AUTHORIZE=65;
    public static final int K_VALUES=23;
    public static final int K_USE=4;
    public static final int T__148=148;
    public static final int STRING_LITERAL=50;
    public static final int T__147=147;
    public static final int K_GRANT=59;
    public static final int T__149=149;
    public static final int K_ON=49;
    public static final int K_USING=24;
    public static final int K_ADD=55;
    public static final int K_ASC=19;
    public static final int K_CUSTOM=46;
    public static final int K_KEY=42;
    public static final int COMMENT=130;
    public static final int K_TRUNCATE=58;
    public static final int K_ORDER=10;
    public static final int HEXNUMBER=79;
    public static final int K_OF=62;
    public static final int K_ALL=66;
    public static final int D=112;
    public static final int T__139=139;
    public static final int E=100;
    public static final int T__138=138;
    public static final int F=104;
    public static final int T__137=137;
    public static final int G=118;
    public static final int T__136=136;
    public static final int K_COUNT=6;
    public static final int K_KEYSPACE=38;
    public static final int K_TYPE=54;
    public static final int A=108;
    public static final int B=119;
    public static final int C=102;
    public static final int L=101;
    public static final int M=107;
    public static final int N=111;
    public static final int O=106;
    public static final int H=110;
    public static final int I=115;
    public static final int J=123;
    public static final int K_UPDATE=26;
    public static final int K=113;
    public static final int K_FILTERING=14;
    public static final int U=116;
    public static final int T=103;
    public static final int W=109;
    public static final int K_TEXT=93;
    public static final int V=121;
    public static final int Q=124;
    public static final int P=117;
    public static final int K_COMPACT=43;
    public static final int S=99;
    public static final int R=105;
    public static final int T__141=141;
    public static final int T__142=142;
    public static final int K_TTL=16;
    public static final int T__140=140;
    public static final int Y=114;
    public static final int T__145=145;
    public static final int X=120;
    public static final int T__146=146;
    public static final int T__143=143;
    public static final int Z=122;
    public static final int T__144=144;
    public static final int K_INDEX=47;
    public static final int K_INSERT=21;
    public static final int WS=129;
    public static final int K_NOT=29;
    public static final int K_RENAME=56;
    public static final int K_APPLY=36;
    public static final int K_INET=91;
    public static final int K_STORAGE=44;
    public static final int K_TIMESTAMP=25;
    public static final int K_NULL=80;
    public static final int K_AND=18;
    public static final int K_DESC=20;
    public static final int K_TOKEN=82;
    public static final int QMARK=81;
    public static final int T__132=132;
    public static final int T__133=133;
    public static final int T__134=134;
    public static final int K_UUID=94;
    public static final int T__135=135;
    public static final int K_BATCH=35;
    public static final int K_ASCII=84;
    public static final int UUID=78;
    public static final int K_LIST=61;
    public static final int K_DELETE=31;
    public static final int K_TO=57;
    public static final int K_BY=11;
    public static final int FLOAT=76;
    public static final int K_VARINT=96;
    public static final int K_FLOAT=90;
    public static final int K_SUPERUSER=71;
    public static final int K_DOUBLE=89;
    public static final int K_SELECT=5;
    public static final int K_LIMIT=12;
    public static final int K_BOOLEAN=87;
    public static final int K_ALTER=53;
    public static final int K_SET=27;
    public static final int K_TRIGGER=51;
    public static final int K_WHERE=9;
    public static final int QUOTED_NAME=75;
    public static final int MULTILINE_COMMENT=131;
    public static final int K_BLOB=86;
    public static final int BOOLEAN=77;
    public static final int K_UNLOGGED=33;
    public static final int HEX=127;
    public static final int K_INTO=22;
    public static final int K_PASSWORD=74;
    public static final int K_REVOKE=60;
    public static final int K_ALLOW=13;
    public static final int K_VARCHAR=95;
    public static final int IDENT=48;
    public static final int DIGIT=125;
    public static final int K_USERS=73;
    public static final int K_BEGIN=32;
    public static final int INTEGER=17;
    public static final int K_KEYSPACES=69;
    public static final int K_COUNTER=34;
    public static final int K_DECIMAL=88;
    public static final int K_WITH=39;
    public static final int K_IN=83;
    public static final int K_NORECURSIVE=63;
    public static final int K_MAP=98;
    public static final int K_IF=28;
    public static final int K_FROM=8;
    public static final int K_COLUMNFAMILY=40;
    public static final int K_MODIFY=64;
    public static final int K_DROP=52;
    public static final int K_NOSUPERUSER=72;
    public static final int K_AS=7;
    public static final int K_BIGINT=85;
    public static final int K_TIMEUUID=97;
    public static final int K_USER=70;

    // delegates
    // delegators


        public CqlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public CqlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return CqlParser.tokenNames; }
    public String getGrammarFileName() { return "/home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g"; }


        private List<String> recognitionErrors = new ArrayList<String>();
        private int currentBindMarkerIdx = -1;

        public void displayRecognitionError(String[] tokenNames, RecognitionException e)
        {
            String hdr = getErrorHeader(e);
            String msg = getErrorMessage(e, tokenNames);
            recognitionErrors.add(hdr + " " + msg);
        }

        public void addRecognitionError(String msg)
        {
            recognitionErrors.add(msg);
        }

        public List<String> getRecognitionErrors()
        {
            return recognitionErrors;
        }

        public void throwLastRecognitionError() throws SyntaxException
        {
            if (recognitionErrors.size() > 0)
                throw new SyntaxException(recognitionErrors.get((recognitionErrors.size()-1)));
        }

        public Map<String, String> convertPropertyMap(Maps.Literal map)
        {
            if (map == null || map.entries == null || map.entries.isEmpty())
                return Collections.<String, String>emptyMap();

            Map<String, String> res = new HashMap<String, String>(map.entries.size());

            for (Pair<Term.Raw, Term.Raw> entry : map.entries)
            {
                // Because the parser tries to be smart and recover on error (to
                // allow displaying more than one error I suppose), we have null
                // entries in there. Just skip those, a proper error will be thrown in the end.
                if (entry.left == null || entry.right == null)
                    break;

                if (!(entry.left instanceof Constants.Literal))
                {
                    addRecognitionError("Invalid property name: " + entry.left);
                    break;
                }
                if (!(entry.right instanceof Constants.Literal))
                {
                    addRecognitionError("Invalid property value: " + entry.right);
                    break;
                }

                res.put(((Constants.Literal)entry.left).getRawText(), ((Constants.Literal)entry.right).getRawText());
            }

            return res;
        }

        public void addRawUpdate(List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key, Operation.RawUpdate update)
        {
            for (Pair<ColumnIdentifier, Operation.RawUpdate> p : operations)
            {
                if (p.left.equals(key) && !p.right.isCompatibleWith(update))
                    addRecognitionError("Multiple incompatible setting of column " + key);
            }
            operations.add(Pair.create(key, update));
        }



    // $ANTLR start "query"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:166:1: query returns [ParsedStatement stmnt] : st= cqlStatement ( ';' )* EOF ;
    public final ParsedStatement query() throws RecognitionException {
        ParsedStatement stmnt = null;

        ParsedStatement st = null;


        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:169:5: (st= cqlStatement ( ';' )* EOF )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:169:7: st= cqlStatement ( ';' )* EOF
            {
            pushFollow(FOLLOW_cqlStatement_in_query72);
            st=cqlStatement();

            state._fsp--;

            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:169:23: ( ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==132) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:169:24: ';'
            	    {
            	    match(input,132,FOLLOW_132_in_query75); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match(input,EOF,FOLLOW_EOF_in_query79); 
             stmnt = st; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmnt;
    }
    // $ANTLR end "query"


    // $ANTLR start "cqlStatement"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:172:1: cqlStatement returns [ParsedStatement stmt] : (st1= selectStatement | st2= insertStatement | st3= updateStatement | st4= batchStatement | st5= deleteStatement | st6= useStatement | st7= truncateStatement | st8= createKeyspaceStatement | st9= createColumnFamilyStatement | st10= createIndexStatement | st11= dropKeyspaceStatement | st12= dropColumnFamilyStatement | st13= dropIndexStatement | st14= alterTableStatement | st15= alterKeyspaceStatement | st16= grantStatement | st17= revokeStatement | st18= listPermissionsStatement | st19= createUserStatement | st20= alterUserStatement | st21= dropUserStatement | st22= listUsersStatement | st23= createTriggerStatement | st24= dropTriggerStatement );
    public final ParsedStatement cqlStatement() throws RecognitionException {
        ParsedStatement stmt = null;

        SelectStatement.RawStatement st1 = null;

        UpdateStatement.ParsedInsert st2 = null;

        UpdateStatement.ParsedUpdate st3 = null;

        BatchStatement.Parsed st4 = null;

        DeleteStatement.Parsed st5 = null;

        UseStatement st6 = null;

        TruncateStatement st7 = null;

        CreateKeyspaceStatement st8 = null;

        CreateColumnFamilyStatement.RawStatement st9 = null;

        CreateIndexStatement st10 = null;

        DropKeyspaceStatement st11 = null;

        DropColumnFamilyStatement st12 = null;

        DropIndexStatement st13 = null;

        AlterTableStatement st14 = null;

        AlterKeyspaceStatement st15 = null;

        GrantStatement st16 = null;

        RevokeStatement st17 = null;

        ListPermissionsStatement st18 = null;

        CreateUserStatement st19 = null;

        AlterUserStatement st20 = null;

        DropUserStatement st21 = null;

        ListUsersStatement st22 = null;

        CreateTriggerStatement st23 = null;

        DropTriggerStatement st24 = null;


        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:174:5: (st1= selectStatement | st2= insertStatement | st3= updateStatement | st4= batchStatement | st5= deleteStatement | st6= useStatement | st7= truncateStatement | st8= createKeyspaceStatement | st9= createColumnFamilyStatement | st10= createIndexStatement | st11= dropKeyspaceStatement | st12= dropColumnFamilyStatement | st13= dropIndexStatement | st14= alterTableStatement | st15= alterKeyspaceStatement | st16= grantStatement | st17= revokeStatement | st18= listPermissionsStatement | st19= createUserStatement | st20= alterUserStatement | st21= dropUserStatement | st22= listUsersStatement | st23= createTriggerStatement | st24= dropTriggerStatement )
            int alt2=24;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:174:7: st1= selectStatement
                    {
                    pushFollow(FOLLOW_selectStatement_in_cqlStatement113);
                    st1=selectStatement();

                    state._fsp--;

                     stmt = st1; 

                    }
                    break;
                case 2 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:175:7: st2= insertStatement
                    {
                    pushFollow(FOLLOW_insertStatement_in_cqlStatement138);
                    st2=insertStatement();

                    state._fsp--;

                     stmt = st2; 

                    }
                    break;
                case 3 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:176:7: st3= updateStatement
                    {
                    pushFollow(FOLLOW_updateStatement_in_cqlStatement163);
                    st3=updateStatement();

                    state._fsp--;

                     stmt = st3; 

                    }
                    break;
                case 4 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:177:7: st4= batchStatement
                    {
                    pushFollow(FOLLOW_batchStatement_in_cqlStatement188);
                    st4=batchStatement();

                    state._fsp--;

                     stmt = st4; 

                    }
                    break;
                case 5 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:178:7: st5= deleteStatement
                    {
                    pushFollow(FOLLOW_deleteStatement_in_cqlStatement214);
                    st5=deleteStatement();

                    state._fsp--;

                     stmt = st5; 

                    }
                    break;
                case 6 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:179:7: st6= useStatement
                    {
                    pushFollow(FOLLOW_useStatement_in_cqlStatement239);
                    st6=useStatement();

                    state._fsp--;

                     stmt = st6; 

                    }
                    break;
                case 7 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:180:7: st7= truncateStatement
                    {
                    pushFollow(FOLLOW_truncateStatement_in_cqlStatement267);
                    st7=truncateStatement();

                    state._fsp--;

                     stmt = st7; 

                    }
                    break;
                case 8 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:181:7: st8= createKeyspaceStatement
                    {
                    pushFollow(FOLLOW_createKeyspaceStatement_in_cqlStatement290);
                    st8=createKeyspaceStatement();

                    state._fsp--;

                     stmt = st8; 

                    }
                    break;
                case 9 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:182:7: st9= createColumnFamilyStatement
                    {
                    pushFollow(FOLLOW_createColumnFamilyStatement_in_cqlStatement307);
                    st9=createColumnFamilyStatement();

                    state._fsp--;

                     stmt = st9; 

                    }
                    break;
                case 10 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:183:7: st10= createIndexStatement
                    {
                    pushFollow(FOLLOW_createIndexStatement_in_cqlStatement319);
                    st10=createIndexStatement();

                    state._fsp--;

                     stmt = st10; 

                    }
                    break;
                case 11 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:184:7: st11= dropKeyspaceStatement
                    {
                    pushFollow(FOLLOW_dropKeyspaceStatement_in_cqlStatement338);
                    st11=dropKeyspaceStatement();

                    state._fsp--;

                     stmt = st11; 

                    }
                    break;
                case 12 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:185:7: st12= dropColumnFamilyStatement
                    {
                    pushFollow(FOLLOW_dropColumnFamilyStatement_in_cqlStatement356);
                    st12=dropColumnFamilyStatement();

                    state._fsp--;

                     stmt = st12; 

                    }
                    break;
                case 13 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:186:7: st13= dropIndexStatement
                    {
                    pushFollow(FOLLOW_dropIndexStatement_in_cqlStatement370);
                    st13=dropIndexStatement();

                    state._fsp--;

                     stmt = st13; 

                    }
                    break;
                case 14 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:187:7: st14= alterTableStatement
                    {
                    pushFollow(FOLLOW_alterTableStatement_in_cqlStatement391);
                    st14=alterTableStatement();

                    state._fsp--;

                     stmt = st14; 

                    }
                    break;
                case 15 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:188:7: st15= alterKeyspaceStatement
                    {
                    pushFollow(FOLLOW_alterKeyspaceStatement_in_cqlStatement411);
                    st15=alterKeyspaceStatement();

                    state._fsp--;

                     stmt = st15; 

                    }
                    break;
                case 16 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:189:7: st16= grantStatement
                    {
                    pushFollow(FOLLOW_grantStatement_in_cqlStatement428);
                    st16=grantStatement();

                    state._fsp--;

                     stmt = st16; 

                    }
                    break;
                case 17 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:190:7: st17= revokeStatement
                    {
                    pushFollow(FOLLOW_revokeStatement_in_cqlStatement453);
                    st17=revokeStatement();

                    state._fsp--;

                     stmt = st17; 

                    }
                    break;
                case 18 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:191:7: st18= listPermissionsStatement
                    {
                    pushFollow(FOLLOW_listPermissionsStatement_in_cqlStatement477);
                    st18=listPermissionsStatement();

                    state._fsp--;

                     stmt = st18; 

                    }
                    break;
                case 19 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:192:7: st19= createUserStatement
                    {
                    pushFollow(FOLLOW_createUserStatement_in_cqlStatement492);
                    st19=createUserStatement();

                    state._fsp--;

                     stmt = st19; 

                    }
                    break;
                case 20 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:193:7: st20= alterUserStatement
                    {
                    pushFollow(FOLLOW_alterUserStatement_in_cqlStatement512);
                    st20=alterUserStatement();

                    state._fsp--;

                     stmt = st20; 

                    }
                    break;
                case 21 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:194:7: st21= dropUserStatement
                    {
                    pushFollow(FOLLOW_dropUserStatement_in_cqlStatement533);
                    st21=dropUserStatement();

                    state._fsp--;

                     stmt = st21; 

                    }
                    break;
                case 22 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:195:7: st22= listUsersStatement
                    {
                    pushFollow(FOLLOW_listUsersStatement_in_cqlStatement555);
                    st22=listUsersStatement();

                    state._fsp--;

                     stmt = st22; 

                    }
                    break;
                case 23 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:196:7: st23= createTriggerStatement
                    {
                    pushFollow(FOLLOW_createTriggerStatement_in_cqlStatement576);
                    st23=createTriggerStatement();

                    state._fsp--;

                     stmt = st23; 

                    }
                    break;
                case 24 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:197:7: st24= dropTriggerStatement
                    {
                    pushFollow(FOLLOW_dropTriggerStatement_in_cqlStatement593);
                    st24=dropTriggerStatement();

                    state._fsp--;

                     stmt = st24; 

                    }
                    break;

            }
             if (stmt != null) stmt.setBoundTerms(currentBindMarkerIdx + 1); 
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "cqlStatement"


    // $ANTLR start "useStatement"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:203:1: useStatement returns [UseStatement stmt] : K_USE ks= keyspaceName ;
    public final UseStatement useStatement() throws RecognitionException {
        UseStatement stmt = null;

        String ks = null;


        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:204:5: ( K_USE ks= keyspaceName )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:204:7: K_USE ks= keyspaceName
            {
            match(input,K_USE,FOLLOW_K_USE_in_useStatement623); 
            pushFollow(FOLLOW_keyspaceName_in_useStatement627);
            ks=keyspaceName();

            state._fsp--;

             stmt = new UseStatement(ks); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "useStatement"


    // $ANTLR start "selectStatement"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:207:1: selectStatement returns [SelectStatement.RawStatement expr] : K_SELECT (sclause= selectClause | ( K_COUNT '(' sclause= selectCountClause ')' ( K_AS c= cident )? ) ) K_FROM cf= columnFamilyName ( K_WHERE wclause= whereClause )? ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )? ( K_LIMIT rows= intValue )? ( K_ALLOW K_FILTERING )? ;
    public final SelectStatement.RawStatement selectStatement() throws RecognitionException {
        SelectStatement.RawStatement expr = null;

        List<RawSelector> sclause = null;

        ColumnIdentifier c = null;

        CFName cf = null;

        List<Relation> wclause = null;

        Term.Raw rows = null;



                boolean isCount = false;
                ColumnIdentifier countAlias = null;
                Term.Raw limit = null;
                Map<ColumnIdentifier, Boolean> orderings = new LinkedHashMap<ColumnIdentifier, Boolean>();
                boolean allowFiltering = false;
            
        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:221:5: ( K_SELECT (sclause= selectClause | ( K_COUNT '(' sclause= selectCountClause ')' ( K_AS c= cident )? ) ) K_FROM cf= columnFamilyName ( K_WHERE wclause= whereClause )? ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )? ( K_LIMIT rows= intValue )? ( K_ALLOW K_FILTERING )? )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:221:7: K_SELECT (sclause= selectClause | ( K_COUNT '(' sclause= selectCountClause ')' ( K_AS c= cident )? ) ) K_FROM cf= columnFamilyName ( K_WHERE wclause= whereClause )? ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )? ( K_LIMIT rows= intValue )? ( K_ALLOW K_FILTERING )?
            {
            match(input,K_SELECT,FOLLOW_K_SELECT_in_selectStatement661); 
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:221:16: (sclause= selectClause | ( K_COUNT '(' sclause= selectCountClause ')' ( K_AS c= cident )? ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==K_AS||(LA4_0>=K_FILTERING && LA4_0<=K_TTL)||LA4_0==K_VALUES||LA4_0==K_TIMESTAMP||LA4_0==K_EXISTS||LA4_0==K_COUNTER||(LA4_0>=K_KEY && LA4_0<=K_CUSTOM)||LA4_0==IDENT||LA4_0==K_TRIGGER||LA4_0==K_TYPE||LA4_0==K_LIST||(LA4_0>=K_ALL && LA4_0<=QUOTED_NAME)||LA4_0==K_TOKEN||(LA4_0>=K_ASCII && LA4_0<=K_MAP)||LA4_0==136) ) {
                alt4=1;
            }
            else if ( (LA4_0==K_COUNT) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==133) ) {
                    alt4=2;
                }
                else if ( ((LA4_2>=K_AS && LA4_2<=K_FROM)||LA4_2==135) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:221:18: sclause= selectClause
                    {
                    pushFollow(FOLLOW_selectClause_in_selectStatement667);
                    sclause=selectClause();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:222:18: ( K_COUNT '(' sclause= selectCountClause ')' ( K_AS c= cident )? )
                    {
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:222:18: ( K_COUNT '(' sclause= selectCountClause ')' ( K_AS c= cident )? )
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:222:19: K_COUNT '(' sclause= selectCountClause ')' ( K_AS c= cident )?
                    {
                    match(input,K_COUNT,FOLLOW_K_COUNT_in_selectStatement687); 
                    match(input,133,FOLLOW_133_in_selectStatement689); 
                    pushFollow(FOLLOW_selectCountClause_in_selectStatement693);
                    sclause=selectCountClause();

                    state._fsp--;

                    match(input,134,FOLLOW_134_in_selectStatement695); 
                     isCount = true; 
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:222:81: ( K_AS c= cident )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==K_AS) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:222:82: K_AS c= cident
                            {
                            match(input,K_AS,FOLLOW_K_AS_in_selectStatement700); 
                            pushFollow(FOLLOW_cident_in_selectStatement704);
                            c=cident();

                            state._fsp--;

                             countAlias = c; 

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            match(input,K_FROM,FOLLOW_K_FROM_in_selectStatement719); 
            pushFollow(FOLLOW_columnFamilyName_in_selectStatement723);
            cf=columnFamilyName();

            state._fsp--;

            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:224:7: ( K_WHERE wclause= whereClause )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==K_WHERE) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:224:9: K_WHERE wclause= whereClause
                    {
                    match(input,K_WHERE,FOLLOW_K_WHERE_in_selectStatement733); 
                    pushFollow(FOLLOW_whereClause_in_selectStatement737);
                    wclause=whereClause();

                    state._fsp--;


                    }
                    break;

            }

            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:225:7: ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==K_ORDER) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:225:9: K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )*
                    {
                    match(input,K_ORDER,FOLLOW_K_ORDER_in_selectStatement750); 
                    match(input,K_BY,FOLLOW_K_BY_in_selectStatement752); 
                    pushFollow(FOLLOW_orderByClause_in_selectStatement754);
                    orderByClause(orderings);

                    state._fsp--;

                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:225:47: ( ',' orderByClause[orderings] )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==135) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:225:49: ',' orderByClause[orderings]
                    	    {
                    	    match(input,135,FOLLOW_135_in_selectStatement759); 
                    	    pushFollow(FOLLOW_orderByClause_in_selectStatement761);
                    	    orderByClause(orderings);

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:226:7: ( K_LIMIT rows= intValue )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==K_LIMIT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:226:9: K_LIMIT rows= intValue
                    {
                    match(input,K_LIMIT,FOLLOW_K_LIMIT_in_selectStatement778); 
                    pushFollow(FOLLOW_intValue_in_selectStatement782);
                    rows=intValue();

                    state._fsp--;

                     limit = rows; 

                    }
                    break;

            }

            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:227:7: ( K_ALLOW K_FILTERING )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==K_ALLOW) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:227:9: K_ALLOW K_FILTERING
                    {
                    match(input,K_ALLOW,FOLLOW_K_ALLOW_in_selectStatement797); 
                    match(input,K_FILTERING,FOLLOW_K_FILTERING_in_selectStatement799); 
                     allowFiltering = true; 

                    }
                    break;

            }


                      SelectStatement.Parameters params = new SelectStatement.Parameters(orderings,
                                                                                         isCount,
                                                                                         countAlias,
                                                                                         allowFiltering);
                      expr = new SelectStatement.RawStatement(cf, params, sclause, wclause, limit);
                  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "selectStatement"


    // $ANTLR start "selectClause"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:237:1: selectClause returns [List<RawSelector> expr] : (t1= selector ( ',' tN= selector )* | '\\*' );
    public final List<RawSelector> selectClause() throws RecognitionException {
        List<RawSelector> expr = null;

        RawSelector t1 = null;

        RawSelector tN = null;


        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:238:5: (t1= selector ( ',' tN= selector )* | '\\*' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=K_COUNT && LA11_0<=K_AS)||(LA11_0>=K_FILTERING && LA11_0<=K_TTL)||LA11_0==K_VALUES||LA11_0==K_TIMESTAMP||LA11_0==K_EXISTS||LA11_0==K_COUNTER||(LA11_0>=K_KEY && LA11_0<=K_CUSTOM)||LA11_0==IDENT||LA11_0==K_TRIGGER||LA11_0==K_TYPE||LA11_0==K_LIST||(LA11_0>=K_ALL && LA11_0<=QUOTED_NAME)||LA11_0==K_TOKEN||(LA11_0>=K_ASCII && LA11_0<=K_MAP)) ) {
                alt11=1;
            }
            else if ( (LA11_0==136) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:238:7: t1= selector ( ',' tN= selector )*
                    {
                    pushFollow(FOLLOW_selector_in_selectClause836);
                    t1=selector();

                    state._fsp--;

                     expr = new ArrayList<RawSelector>(); expr.add(t1); 
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:238:76: ( ',' tN= selector )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==135) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:238:77: ',' tN= selector
                    	    {
                    	    match(input,135,FOLLOW_135_in_selectClause841); 
                    	    pushFollow(FOLLOW_selector_in_selectClause845);
                    	    tN=selector();

                    	    state._fsp--;

                    	     expr.add(tN); 

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:239:7: '\\*'
                    {
                    match(input,136,FOLLOW_136_in_selectClause857); 
                     expr = Collections.<RawSelector>emptyList();

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "selectClause"


    // $ANTLR start "selector"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:242:1: selector returns [RawSelector s] : us= unaliasedSelector ( K_AS c= cident )? ;
    public final RawSelector selector() throws RecognitionException {
        RawSelector s = null;

        Selectable us = null;

        ColumnIdentifier c = null;


         ColumnIdentifier alias = null; 
        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:244:5: (us= unaliasedSelector ( K_AS c= cident )? )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:244:7: us= unaliasedSelector ( K_AS c= cident )?
            {
            pushFollow(FOLLOW_unaliasedSelector_in_selector890);
            us=unaliasedSelector();

            state._fsp--;

            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:244:28: ( K_AS c= cident )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==K_AS) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:244:29: K_AS c= cident
                    {
                    match(input,K_AS,FOLLOW_K_AS_in_selector893); 
                    pushFollow(FOLLOW_cident_in_selector897);
                    c=cident();

                    state._fsp--;

                     alias = c; 

                    }
                    break;

            }

             s = new RawSelector(us, alias); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return s;
    }
    // $ANTLR end "selector"


    // $ANTLR start "unaliasedSelector"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:247:1: unaliasedSelector returns [Selectable s] : (c= cident | K_WRITETIME '(' c= cident ')' | K_TTL '(' c= cident ')' | f= functionName args= selectionFunctionArgs );
    public final Selectable unaliasedSelector() throws RecognitionException {
        Selectable s = null;

        ColumnIdentifier c = null;

        String f = null;

        List<Selectable> args = null;


        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:248:5: (c= cident | K_WRITETIME '(' c= cident ')' | K_TTL '(' c= cident ')' | f= functionName args= selectionFunctionArgs )
            int alt13=4;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:248:7: c= cident
                    {
                    pushFollow(FOLLOW_cident_in_unaliasedSelector926);
                    c=cident();

                    state._fsp--;

                     s = c; 

                    }
                    break;
                case 2 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:249:7: K_WRITETIME '(' c= cident ')'
                    {
                    match(input,K_WRITETIME,FOLLOW_K_WRITETIME_in_unaliasedSelector969); 
                    match(input,133,FOLLOW_133_in_unaliasedSelector971); 
                    pushFollow(FOLLOW_cident_in_unaliasedSelector975);
                    c=cident();

                    state._fsp--;

                    match(input,134,FOLLOW_134_in_unaliasedSelector977); 
                     s = new Selectable.WritetimeOrTTL(c, true); 

                    }
                    break;
                case 3 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:250:7: K_TTL '(' c= cident ')'
                    {
                    match(input,K_TTL,FOLLOW_K_TTL_in_unaliasedSelector1000); 
                    match(input,133,FOLLOW_133_in_unaliasedSelector1008); 
                    pushFollow(FOLLOW_cident_in_unaliasedSelector1012);
                    c=cident();

                    state._fsp--;

                    match(input,134,FOLLOW_134_in_unaliasedSelector1014); 
                     s = new Selectable.WritetimeOrTTL(c, false); 

                    }
                    break;
                case 4 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:251:7: f= functionName args= selectionFunctionArgs
                    {
                    pushFollow(FOLLOW_functionName_in_unaliasedSelector1039);
                    f=functionName();

                    state._fsp--;

                    pushFollow(FOLLOW_selectionFunctionArgs_in_unaliasedSelector1043);
                    args=selectionFunctionArgs();

                    state._fsp--;

                     s = new Selectable.WithFunction(f, args); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return s;
    }
    // $ANTLR end "unaliasedSelector"


    // $ANTLR start "selectionFunctionArgs"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:254:1: selectionFunctionArgs returns [List<Selectable> a] : ( '(' ')' | '(' s1= unaliasedSelector ( ',' sn= unaliasedSelector )* ')' );
    public final List<Selectable> selectionFunctionArgs() throws RecognitionException {
        List<Selectable> a = null;

        Selectable s1 = null;

        Selectable sn = null;


        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:255:5: ( '(' ')' | '(' s1= unaliasedSelector ( ',' sn= unaliasedSelector )* ')' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==133) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==134) ) {
                    alt15=1;
                }
                else if ( ((LA15_1>=K_COUNT && LA15_1<=K_AS)||(LA15_1>=K_FILTERING && LA15_1<=K_TTL)||LA15_1==K_VALUES||LA15_1==K_TIMESTAMP||LA15_1==K_EXISTS||LA15_1==K_COUNTER||(LA15_1>=K_KEY && LA15_1<=K_CUSTOM)||LA15_1==IDENT||LA15_1==K_TRIGGER||LA15_1==K_TYPE||LA15_1==K_LIST||(LA15_1>=K_ALL && LA15_1<=QUOTED_NAME)||LA15_1==K_TOKEN||(LA15_1>=K_ASCII && LA15_1<=K_MAP)) ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:255:7: '(' ')'
                    {
                    match(input,133,FOLLOW_133_in_selectionFunctionArgs1066); 
                    match(input,134,FOLLOW_134_in_selectionFunctionArgs1068); 
                     a = Collections.emptyList(); 

                    }
                    break;
                case 2 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:256:7: '(' s1= unaliasedSelector ( ',' sn= unaliasedSelector )* ')'
                    {
                    match(input,133,FOLLOW_133_in_selectionFunctionArgs1078); 
                    pushFollow(FOLLOW_unaliasedSelector_in_selectionFunctionArgs1082);
                    s1=unaliasedSelector();

                    state._fsp--;

                     List<Selectable> args = new ArrayList<Selectable>(); args.add(s1); 
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:257:11: ( ',' sn= unaliasedSelector )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==135) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:257:13: ',' sn= unaliasedSelector
                    	    {
                    	    match(input,135,FOLLOW_135_in_selectionFunctionArgs1098); 
                    	    pushFollow(FOLLOW_unaliasedSelector_in_selectionFunctionArgs1102);
                    	    sn=unaliasedSelector();

                    	    state._fsp--;

                    	     args.add(sn); 

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    match(input,134,FOLLOW_134_in_selectionFunctionArgs1116); 
                     a = args; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return a;
    }
    // $ANTLR end "selectionFunctionArgs"


    // $ANTLR start "selectCountClause"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:261:1: selectCountClause returns [List<RawSelector> expr] : ( '\\*' | i= INTEGER );
    public final List<RawSelector> selectCountClause() throws RecognitionException {
        List<RawSelector> expr = null;

        Token i=null;

        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:262:5: ( '\\*' | i= INTEGER )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==136) ) {
                alt16=1;
            }
            else if ( (LA16_0==INTEGER) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:262:7: '\\*'
                    {
                    match(input,136,FOLLOW_136_in_selectCountClause1139); 
                     expr = Collections.<RawSelector>emptyList();

                    }
                    break;
                case 2 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:263:7: i= INTEGER
                    {
                    i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_selectCountClause1161); 
                     if (!i.getText().equals("1")) addRecognitionError("Only COUNT(1) is supported, got COUNT(" + i.getText() + ")"); expr = Collections.<RawSelector>emptyList();

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "selectCountClause"


    // $ANTLR start "whereClause"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:266:1: whereClause returns [List<Relation> clause] : relation[$clause] ( K_AND relation[$clause] )* ;
    public final List<Relation> whereClause() throws RecognitionException {
        List<Relation> clause = null;

         clause = new ArrayList<Relation>(); 
        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:268:5: ( relation[$clause] ( K_AND relation[$clause] )* )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:268:7: relation[$clause] ( K_AND relation[$clause] )*
            {
            pushFollow(FOLLOW_relation_in_whereClause1197);
            relation(clause);

            state._fsp--;

            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:268:25: ( K_AND relation[$clause] )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==K_AND) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:268:26: K_AND relation[$clause]
            	    {
            	    match(input,K_AND,FOLLOW_K_AND_in_whereClause1201); 
            	    pushFollow(FOLLOW_relation_in_whereClause1203);
            	    relation(clause);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return clause;
    }
    // $ANTLR end "whereClause"


    // $ANTLR start "orderByClause"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:271:1: orderByClause[Map<ColumnIdentifier, Boolean> orderings] : c= cident ( K_ASC | K_DESC )? ;
    public final void orderByClause(Map<ColumnIdentifier, Boolean> orderings) throws RecognitionException {
        ColumnIdentifier c = null;



                ColumnIdentifier orderBy = null;
                boolean reversed = false;
            
        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:276:5: (c= cident ( K_ASC | K_DESC )? )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:276:7: c= cident ( K_ASC | K_DESC )?
            {
            pushFollow(FOLLOW_cident_in_orderByClause1234);
            c=cident();

            state._fsp--;

             orderBy = c; 
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:276:33: ( K_ASC | K_DESC )?
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==K_ASC) ) {
                alt18=1;
            }
            else if ( (LA18_0==K_DESC) ) {
                alt18=2;
            }
            switch (alt18) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:276:34: K_ASC
                    {
                    match(input,K_ASC,FOLLOW_K_ASC_in_orderByClause1239); 

                    }
                    break;
                case 2 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:276:42: K_DESC
                    {
                    match(input,K_DESC,FOLLOW_K_DESC_in_orderByClause1243); 
                     reversed = true; 

                    }
                    break;

            }

             orderings.put(c, reversed); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "orderByClause"


    // $ANTLR start "insertStatement"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:279:1: insertStatement returns [UpdateStatement.ParsedInsert expr] : K_INSERT K_INTO cf= columnFamilyName '(' c1= cident ( ',' cn= cident )* ')' K_VALUES '(' v1= term ( ',' vn= term )* ')' ( usingClause[attrs] )? ;
    public final UpdateStatement.ParsedInsert insertStatement() throws RecognitionException {
        UpdateStatement.ParsedInsert expr = null;

        CFName cf = null;

        ColumnIdentifier c1 = null;

        ColumnIdentifier cn = null;

        Term.Raw v1 = null;

        Term.Raw vn = null;



                Attributes.Raw attrs = new Attributes.Raw();
                List<ColumnIdentifier> columnNames  = new ArrayList<ColumnIdentifier>();
                List<Term.Raw> values = new ArrayList<Term.Raw>();
            
        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:291:5: ( K_INSERT K_INTO cf= columnFamilyName '(' c1= cident ( ',' cn= cident )* ')' K_VALUES '(' v1= term ( ',' vn= term )* ')' ( usingClause[attrs] )? )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:291:7: K_INSERT K_INTO cf= columnFamilyName '(' c1= cident ( ',' cn= cident )* ')' K_VALUES '(' v1= term ( ',' vn= term )* ')' ( usingClause[attrs] )?
            {
            match(input,K_INSERT,FOLLOW_K_INSERT_in_insertStatement1281); 
            match(input,K_INTO,FOLLOW_K_INTO_in_insertStatement1283); 
            pushFollow(FOLLOW_columnFamilyName_in_insertStatement1287);
            cf=columnFamilyName();

            state._fsp--;

            match(input,133,FOLLOW_133_in_insertStatement1299); 
            pushFollow(FOLLOW_cident_in_insertStatement1303);
            c1=cident();

            state._fsp--;

             columnNames.add(c1); 
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:292:51: ( ',' cn= cident )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==135) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:292:53: ',' cn= cident
            	    {
            	    match(input,135,FOLLOW_135_in_insertStatement1310); 
            	    pushFollow(FOLLOW_cident_in_insertStatement1314);
            	    cn=cident();

            	    state._fsp--;

            	     columnNames.add(cn); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            match(input,134,FOLLOW_134_in_insertStatement1321); 
            match(input,K_VALUES,FOLLOW_K_VALUES_in_insertStatement1331); 
            match(input,133,FOLLOW_133_in_insertStatement1343); 
            pushFollow(FOLLOW_term_in_insertStatement1347);
            v1=term();

            state._fsp--;

             values.add(v1); 
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:294:43: ( ',' vn= term )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==135) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:294:45: ',' vn= term
            	    {
            	    match(input,135,FOLLOW_135_in_insertStatement1353); 
            	    pushFollow(FOLLOW_term_in_insertStatement1357);
            	    vn=term();

            	    state._fsp--;

            	     values.add(vn); 

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            match(input,134,FOLLOW_134_in_insertStatement1364); 
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:295:9: ( usingClause[attrs] )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==K_USING) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:295:11: usingClause[attrs]
                    {
                    pushFollow(FOLLOW_usingClause_in_insertStatement1376);
                    usingClause(attrs);

                    state._fsp--;


                    }
                    break;

            }


                      expr = new UpdateStatement.ParsedInsert(cf, attrs, columnNames, values);
                  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "insertStatement"


    // $ANTLR start "usingClause"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:301:1: usingClause[Attributes.Raw attrs] : K_USING usingClauseObjective[attrs] ( ( K_AND )? usingClauseObjective[attrs] )* ;
    public final void usingClause(Attributes.Raw attrs) throws RecognitionException {
        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:302:5: ( K_USING usingClauseObjective[attrs] ( ( K_AND )? usingClauseObjective[attrs] )* )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:302:7: K_USING usingClauseObjective[attrs] ( ( K_AND )? usingClauseObjective[attrs] )*
            {
            match(input,K_USING,FOLLOW_K_USING_in_usingClause1406); 
            pushFollow(FOLLOW_usingClauseObjective_in_usingClause1408);
            usingClauseObjective(attrs);

            state._fsp--;

            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:302:43: ( ( K_AND )? usingClauseObjective[attrs] )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==K_TTL||LA23_0==K_AND||LA23_0==K_TIMESTAMP) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:302:45: ( K_AND )? usingClauseObjective[attrs]
            	    {
            	    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:302:45: ( K_AND )?
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==K_AND) ) {
            	        alt22=1;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:302:45: K_AND
            	            {
            	            match(input,K_AND,FOLLOW_K_AND_in_usingClause1413); 

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_usingClauseObjective_in_usingClause1416);
            	    usingClauseObjective(attrs);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "usingClause"


    // $ANTLR start "usingClauseDelete"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:305:1: usingClauseDelete[Attributes.Raw attrs] : K_USING usingClauseDeleteObjective[attrs] ( ( K_AND )? usingClauseDeleteObjective[attrs] )* ;
    public final void usingClauseDelete(Attributes.Raw attrs) throws RecognitionException {
        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:306:5: ( K_USING usingClauseDeleteObjective[attrs] ( ( K_AND )? usingClauseDeleteObjective[attrs] )* )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:306:7: K_USING usingClauseDeleteObjective[attrs] ( ( K_AND )? usingClauseDeleteObjective[attrs] )*
            {
            match(input,K_USING,FOLLOW_K_USING_in_usingClauseDelete1438); 
            pushFollow(FOLLOW_usingClauseDeleteObjective_in_usingClauseDelete1440);
            usingClauseDeleteObjective(attrs);

            state._fsp--;

            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:306:49: ( ( K_AND )? usingClauseDeleteObjective[attrs] )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==K_AND||LA25_0==K_TIMESTAMP) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:306:51: ( K_AND )? usingClauseDeleteObjective[attrs]
            	    {
            	    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:306:51: ( K_AND )?
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==K_AND) ) {
            	        alt24=1;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:306:51: K_AND
            	            {
            	            match(input,K_AND,FOLLOW_K_AND_in_usingClauseDelete1445); 

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_usingClauseDeleteObjective_in_usingClauseDelete1448);
            	    usingClauseDeleteObjective(attrs);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "usingClauseDelete"


    // $ANTLR start "usingClauseDeleteObjective"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:309:1: usingClauseDeleteObjective[Attributes.Raw attrs] : K_TIMESTAMP ts= intValue ;
    public final void usingClauseDeleteObjective(Attributes.Raw attrs) throws RecognitionException {
        Term.Raw ts = null;


        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:310:5: ( K_TIMESTAMP ts= intValue )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:310:7: K_TIMESTAMP ts= intValue
            {
            match(input,K_TIMESTAMP,FOLLOW_K_TIMESTAMP_in_usingClauseDeleteObjective1470); 
            pushFollow(FOLLOW_intValue_in_usingClauseDeleteObjective1474);
            ts=intValue();

            state._fsp--;

             attrs.timestamp = ts; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "usingClauseDeleteObjective"


    // $ANTLR start "usingClauseObjective"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:313:1: usingClauseObjective[Attributes.Raw attrs] : ( usingClauseDeleteObjective[attrs] | K_TTL t= intValue );
    public final void usingClauseObjective(Attributes.Raw attrs) throws RecognitionException {
        Term.Raw t = null;


        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:314:5: ( usingClauseDeleteObjective[attrs] | K_TTL t= intValue )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==K_TIMESTAMP) ) {
                alt26=1;
            }
            else if ( (LA26_0==K_TTL) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:314:7: usingClauseDeleteObjective[attrs]
                    {
                    pushFollow(FOLLOW_usingClauseDeleteObjective_in_usingClauseObjective1494);
                    usingClauseDeleteObjective(attrs);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:315:7: K_TTL t= intValue
                    {
                    match(input,K_TTL,FOLLOW_K_TTL_in_usingClauseObjective1503); 
                    pushFollow(FOLLOW_intValue_in_usingClauseObjective1507);
                    t=intValue();

                    state._fsp--;

                     attrs.timeToLive = t; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "usingClauseObjective"


    // $ANTLR start "updateStatement"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:318:1: updateStatement returns [UpdateStatement.ParsedUpdate expr] : K_UPDATE cf= columnFamilyName ( usingClause[attrs] )? K_SET columnOperation[operations] ( ',' columnOperation[operations] )* K_WHERE wclause= whereClause ( K_IF ( K_NOT K_EXISTS | conditions= updateCondition ) )? ;
    public final UpdateStatement.ParsedUpdate updateStatement() throws RecognitionException {
        UpdateStatement.ParsedUpdate expr = null;

        CFName cf = null;

        List<Relation> wclause = null;

        List<Pair<ColumnIdentifier, Operation.RawUpdate>> conditions = null;



                Attributes.Raw attrs = new Attributes.Raw();
                List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations = new ArrayList<Pair<ColumnIdentifier, Operation.RawUpdate>>();
                boolean ifNotExists = false;
            
        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:330:5: ( K_UPDATE cf= columnFamilyName ( usingClause[attrs] )? K_SET columnOperation[operations] ( ',' columnOperation[operations] )* K_WHERE wclause= whereClause ( K_IF ( K_NOT K_EXISTS | conditions= updateCondition ) )? )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:330:7: K_UPDATE cf= columnFamilyName ( usingClause[attrs] )? K_SET columnOperation[operations] ( ',' columnOperation[operations] )* K_WHERE wclause= whereClause ( K_IF ( K_NOT K_EXISTS | conditions= updateCondition ) )?
            {
            match(input,K_UPDATE,FOLLOW_K_UPDATE_in_updateStatement1541); 
            pushFollow(FOLLOW_columnFamilyName_in_updateStatement1545);
            cf=columnFamilyName();

            state._fsp--;

            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:331:7: ( usingClause[attrs] )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==K_USING) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:331:9: usingClause[attrs]
                    {
                    pushFollow(FOLLOW_usingClause_in_updateStatement1555);
                    usingClause(attrs);

                    state._fsp--;


                    }
                    break;

            }

            match(input,K_SET,FOLLOW_K_SET_in_updateStatement1567); 
            pushFollow(FOLLOW_columnOperation_in_updateStatement1569);
            columnOperation(operations);

            state._fsp--;

            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:332:41: ( ',' columnOperation[operations] )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==135) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:332:42: ',' columnOperation[operations]
            	    {
            	    match(input,135,FOLLOW_135_in_updateStatement1573); 
            	    pushFollow(FOLLOW_columnOperation_in_updateStatement1575);
            	    columnOperation(operations);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            match(input,K_WHERE,FOLLOW_K_WHERE_in_updateStatement1586); 
            pushFollow(FOLLOW_whereClause_in_updateStatement1590);
            wclause=whereClause();

            state._fsp--;

            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:334:7: ( K_IF ( K_NOT K_EXISTS | conditions= updateCondition ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==K_IF) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:334:9: K_IF ( K_NOT K_EXISTS | conditions= updateCondition )
                    {
                    match(input,K_IF,FOLLOW_K_IF_in_updateStatement1600); 
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:334:14: ( K_NOT K_EXISTS | conditions= updateCondition )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==K_NOT) ) {
                        alt29=1;
                    }
                    else if ( ((LA29_0>=K_COUNT && LA29_0<=K_AS)||(LA29_0>=K_FILTERING && LA29_0<=K_TTL)||LA29_0==K_VALUES||LA29_0==K_TIMESTAMP||LA29_0==K_EXISTS||LA29_0==K_COUNTER||(LA29_0>=K_KEY && LA29_0<=K_CUSTOM)||LA29_0==IDENT||LA29_0==K_TRIGGER||LA29_0==K_TYPE||LA29_0==K_LIST||(LA29_0>=K_ALL && LA29_0<=QUOTED_NAME)||(LA29_0>=K_ASCII && LA29_0<=K_MAP)) ) {
                        alt29=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;
                    }
                    switch (alt29) {
                        case 1 :
                            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:334:15: K_NOT K_EXISTS
                            {
                            match(input,K_NOT,FOLLOW_K_NOT_in_updateStatement1603); 
                            match(input,K_EXISTS,FOLLOW_K_EXISTS_in_updateStatement1605); 
                             ifNotExists = true; 

                            }
                            break;
                        case 2 :
                            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:334:56: conditions= updateCondition
                            {
                            pushFollow(FOLLOW_updateCondition_in_updateStatement1613);
                            conditions=updateCondition();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }


                      return new UpdateStatement.ParsedUpdate(cf,
                                                              attrs,
                                                              operations,
                                                              wclause,
                                                              conditions == null ? Collections.<Pair<ColumnIdentifier, Operation.RawUpdate>>emptyList() : conditions,
                                                              ifNotExists);
                  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "updateStatement"


    // $ANTLR start "updateCondition"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:345:1: updateCondition returns [List<Pair<ColumnIdentifier, Operation.RawUpdate>> conditions] : columnOperation[conditions] ( K_AND columnOperation[conditions] )* ;
    public final List<Pair<ColumnIdentifier, Operation.RawUpdate>> updateCondition() throws RecognitionException {
        List<Pair<ColumnIdentifier, Operation.RawUpdate>> conditions = null;

         conditions = new ArrayList<Pair<ColumnIdentifier, Operation.RawUpdate>>(); 
        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:347:5: ( columnOperation[conditions] ( K_AND columnOperation[conditions] )* )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:347:7: columnOperation[conditions] ( K_AND columnOperation[conditions] )*
            {
            pushFollow(FOLLOW_columnOperation_in_updateCondition1655);
            columnOperation(conditions);

            state._fsp--;

            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:347:35: ( K_AND columnOperation[conditions] )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==K_AND) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:347:37: K_AND columnOperation[conditions]
            	    {
            	    match(input,K_AND,FOLLOW_K_AND_in_updateCondition1660); 
            	    pushFollow(FOLLOW_columnOperation_in_updateCondition1662);
            	    columnOperation(conditions);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return conditions;
    }
    // $ANTLR end "updateCondition"


    // $ANTLR start "deleteStatement"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:350:1: deleteStatement returns [DeleteStatement.Parsed expr] : K_DELETE (dels= deleteSelection )? K_FROM cf= columnFamilyName ( usingClauseDelete[attrs] )? K_WHERE wclause= whereClause ( K_IF conditions= updateCondition )? ;
    public final DeleteStatement.Parsed deleteStatement() throws RecognitionException {
        DeleteStatement.Parsed expr = null;

        List<Operation.RawDeletion> dels = null;

        CFName cf = null;

        List<Relation> wclause = null;

        List<Pair<ColumnIdentifier, Operation.RawUpdate>> conditions = null;



                Attributes.Raw attrs = new Attributes.Raw();
                List<Operation.RawDeletion> columnDeletions = Collections.emptyList();
            
        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:361:5: ( K_DELETE (dels= deleteSelection )? K_FROM cf= columnFamilyName ( usingClauseDelete[attrs] )? K_WHERE wclause= whereClause ( K_IF conditions= updateCondition )? )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:361:7: K_DELETE (dels= deleteSelection )? K_FROM cf= columnFamilyName ( usingClauseDelete[attrs] )? K_WHERE wclause= whereClause ( K_IF conditions= updateCondition )?
            {
            match(input,K_DELETE,FOLLOW_K_DELETE_in_deleteStatement1698); 
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:361:16: (dels= deleteSelection )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=K_COUNT && LA32_0<=K_AS)||(LA32_0>=K_FILTERING && LA32_0<=K_TTL)||LA32_0==K_VALUES||LA32_0==K_TIMESTAMP||LA32_0==K_EXISTS||LA32_0==K_COUNTER||(LA32_0>=K_KEY && LA32_0<=K_CUSTOM)||LA32_0==IDENT||LA32_0==K_TRIGGER||LA32_0==K_TYPE||LA32_0==K_LIST||(LA32_0>=K_ALL && LA32_0<=QUOTED_NAME)||(LA32_0>=K_ASCII && LA32_0<=K_MAP)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:361:18: dels= deleteSelection
                    {
                    pushFollow(FOLLOW_deleteSelection_in_deleteStatement1704);
                    dels=deleteSelection();

                    state._fsp--;

                     columnDeletions = dels; 

                    }
                    break;

            }

            match(input,K_FROM,FOLLOW_K_FROM_in_deleteStatement1717); 
            pushFollow(FOLLOW_columnFamilyName_in_deleteStatement1721);
            cf=columnFamilyName();

            state._fsp--;

            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:363:7: ( usingClauseDelete[attrs] )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==K_USING) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:363:9: usingClauseDelete[attrs]
                    {
                    pushFollow(FOLLOW_usingClauseDelete_in_deleteStatement1731);
                    usingClauseDelete(attrs);

                    state._fsp--;


                    }
                    break;

            }

            match(input,K_WHERE,FOLLOW_K_WHERE_in_deleteStatement1743); 
            pushFollow(FOLLOW_whereClause_in_deleteStatement1747);
            wclause=whereClause();

            state._fsp--;

            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:365:7: ( K_IF conditions= updateCondition )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==K_IF) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:365:9: K_IF conditions= updateCondition
                    {
                    match(input,K_IF,FOLLOW_K_IF_in_deleteStatement1757); 
                    pushFollow(FOLLOW_updateCondition_in_deleteStatement1761);
                    conditions=updateCondition();

                    state._fsp--;


                    }
                    break;

            }


                      return new DeleteStatement.Parsed(cf,
                                                        attrs,
                                                        columnDeletions,
                                                        wclause,
                                                        conditions == null ? Collections.<Pair<ColumnIdentifier, Operation.RawUpdate>>emptyList() : conditions);
                  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "deleteStatement"


    // $ANTLR start "deleteSelection"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:375:1: deleteSelection returns [List<Operation.RawDeletion> operations] : t1= deleteOp ( ',' tN= deleteOp )* ;
    public final List<Operation.RawDeletion> deleteSelection() throws RecognitionException {
        List<Operation.RawDeletion> operations = null;

        Operation.RawDeletion t1 = null;

        Operation.RawDeletion tN = null;


        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:376:5: (t1= deleteOp ( ',' tN= deleteOp )* )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:376:7: t1= deleteOp ( ',' tN= deleteOp )*
            {
             operations = new ArrayList<Operation.RawDeletion>(); 
            pushFollow(FOLLOW_deleteOp_in_deleteSelection1807);
            t1=deleteOp();

            state._fsp--;

             operations.add(t1); 
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:378:11: ( ',' tN= deleteOp )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==135) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:378:12: ',' tN= deleteOp
            	    {
            	    match(input,135,FOLLOW_135_in_deleteSelection1822); 
            	    pushFollow(FOLLOW_deleteOp_in_deleteSelection1826);
            	    tN=deleteOp();

            	    state._fsp--;

            	     operations.add(tN); 

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return operations;
    }
    // $ANTLR end "deleteSelection"


    // $ANTLR start "deleteOp"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:381:1: deleteOp returns [Operation.RawDeletion op] : (c= cident | c= cident '[' t= term ']' );
    public final Operation.RawDeletion deleteOp() throws RecognitionException {
        Operation.RawDeletion op = null;

        ColumnIdentifier c = null;

        Term.Raw t = null;


        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:382:5: (c= cident | c= cident '[' t= term ']' )
            int alt36=2;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:382:7: c= cident
                    {
                    pushFollow(FOLLOW_cident_in_deleteOp1853);
                    c=cident();

                    state._fsp--;

                     op = new Operation.ColumnDeletion(c); 

                    }
                    break;
                case 2 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:383:7: c= cident '[' t= term ']'
                    {
                    pushFollow(FOLLOW_cident_in_deleteOp1880);
                    c=cident();

                    state._fsp--;

                    match(input,137,FOLLOW_137_in_deleteOp1882); 
                    pushFollow(FOLLOW_term_in_deleteOp1886);
                    t=term();

                    state._fsp--;

                    match(input,138,FOLLOW_138_in_deleteOp1888); 
                     op = new Operation.ElementDeletion(c, t); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return op;
    }
    // $ANTLR end "deleteOp"


    // $ANTLR start "batchStatement"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:386:1: batchStatement returns [BatchStatement.Parsed expr] : K_BEGIN ( K_UNLOGGED | K_COUNTER )? K_BATCH ( usingClause[attrs] )? s1= batchStatementObjective ( ';' )? (sN= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH ;
    public final BatchStatement.Parsed batchStatement() throws RecognitionException {
        BatchStatement.Parsed expr = null;

        ModificationStatement.Parsed s1 = null;

        ModificationStatement.Parsed sN = null;



                BatchStatement.Type type = BatchStatement.Type.LOGGED;
                List<ModificationStatement.Parsed> statements = new ArrayList<ModificationStatement.Parsed>();
                Attributes.Raw attrs = new Attributes.Raw();
            
        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:416:5: ( K_BEGIN ( K_UNLOGGED | K_COUNTER )? K_BATCH ( usingClause[attrs] )? s1= batchStatementObjective ( ';' )? (sN= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:416:7: K_BEGIN ( K_UNLOGGED | K_COUNTER )? K_BATCH ( usingClause[attrs] )? s1= batchStatementObjective ( ';' )? (sN= batchStatementObjective ( ';' )? )* K_APPLY K_BATCH
            {
            match(input,K_BEGIN,FOLLOW_K_BEGIN_in_batchStatement1922); 
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:417:7: ( K_UNLOGGED | K_COUNTER )?
            int alt37=3;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==K_UNLOGGED) ) {
                alt37=1;
            }
            else if ( (LA37_0==K_COUNTER) ) {
                alt37=2;
            }
            switch (alt37) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:417:9: K_UNLOGGED
                    {
                    match(input,K_UNLOGGED,FOLLOW_K_UNLOGGED_in_batchStatement1932); 
                     type = BatchStatement.Type.UNLOGGED; 

                    }
                    break;
                case 2 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:417:63: K_COUNTER
                    {
                    match(input,K_COUNTER,FOLLOW_K_COUNTER_in_batchStatement1938); 
                     type = BatchStatement.Type.COUNTER; 

                    }
                    break;

            }

            match(input,K_BATCH,FOLLOW_K_BATCH_in_batchStatement1951); 
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:418:15: ( usingClause[attrs] )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==K_USING) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:418:17: usingClause[attrs]
                    {
                    pushFollow(FOLLOW_usingClause_in_batchStatement1955);
                    usingClause(attrs);

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_batchStatementObjective_in_batchStatement1973);
            s1=batchStatementObjective();

            state._fsp--;

            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:419:38: ( ';' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==132) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:419:38: ';'
                    {
                    match(input,132,FOLLOW_132_in_batchStatement1975); 

                    }
                    break;

            }

             statements.add(s1); 
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:419:67: (sN= batchStatementObjective ( ';' )? )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==K_INSERT||LA41_0==K_UPDATE||LA41_0==K_DELETE) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:419:69: sN= batchStatementObjective ( ';' )?
            	    {
            	    pushFollow(FOLLOW_batchStatementObjective_in_batchStatement1984);
            	    sN=batchStatementObjective();

            	    state._fsp--;

            	    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:419:96: ( ';' )?
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==132) ) {
            	        alt40=1;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:419:96: ';'
            	            {
            	            match(input,132,FOLLOW_132_in_batchStatement1986); 

            	            }
            	            break;

            	    }

            	     statements.add(sN); 

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            match(input,K_APPLY,FOLLOW_K_APPLY_in_batchStatement2000); 
            match(input,K_BATCH,FOLLOW_K_BATCH_in_batchStatement2002); 

                      return new BatchStatement.Parsed(type, attrs, statements);
                  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "batchStatement"


    // $ANTLR start "batchStatementObjective"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:426:1: batchStatementObjective returns [ModificationStatement.Parsed statement] : (i= insertStatement | u= updateStatement | d= deleteStatement );
    public final ModificationStatement.Parsed batchStatementObjective() throws RecognitionException {
        ModificationStatement.Parsed statement = null;

        UpdateStatement.ParsedInsert i = null;

        UpdateStatement.ParsedUpdate u = null;

        DeleteStatement.Parsed d = null;


        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:427:5: (i= insertStatement | u= updateStatement | d= deleteStatement )
            int alt42=3;
            switch ( input.LA(1) ) {
            case K_INSERT:
                {
                alt42=1;
                }
                break;
            case K_UPDATE:
                {
                alt42=2;
                }
                break;
            case K_DELETE:
                {
                alt42=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:427:7: i= insertStatement
                    {
                    pushFollow(FOLLOW_insertStatement_in_batchStatementObjective2033);
                    i=insertStatement();

                    state._fsp--;

                     statement = i; 

                    }
                    break;
                case 2 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:428:7: u= updateStatement
                    {
                    pushFollow(FOLLOW_updateStatement_in_batchStatementObjective2046);
                    u=updateStatement();

                    state._fsp--;

                     statement = u; 

                    }
                    break;
                case 3 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:429:7: d= deleteStatement
                    {
                    pushFollow(FOLLOW_deleteStatement_in_batchStatementObjective2059);
                    d=deleteStatement();

                    state._fsp--;

                     statement = d; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return statement;
    }
    // $ANTLR end "batchStatementObjective"


    // $ANTLR start "createKeyspaceStatement"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:432:1: createKeyspaceStatement returns [CreateKeyspaceStatement expr] : K_CREATE K_KEYSPACE ( K_IF K_NOT K_EXISTS )? ks= keyspaceName K_WITH properties[attrs] ;
    public final CreateKeyspaceStatement createKeyspaceStatement() throws RecognitionException {
        CreateKeyspaceStatement expr = null;

        String ks = null;



                KSPropDefs attrs = new KSPropDefs();
                boolean ifNotExists = false;
            
        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:440:5: ( K_CREATE K_KEYSPACE ( K_IF K_NOT K_EXISTS )? ks= keyspaceName K_WITH properties[attrs] )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:440:7: K_CREATE K_KEYSPACE ( K_IF K_NOT K_EXISTS )? ks= keyspaceName K_WITH properties[attrs]
            {
            match(input,K_CREATE,FOLLOW_K_CREATE_in_createKeyspaceStatement2094); 
            match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_createKeyspaceStatement2096); 
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:440:27: ( K_IF K_NOT K_EXISTS )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==K_IF) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:440:28: K_IF K_NOT K_EXISTS
                    {
                    match(input,K_IF,FOLLOW_K_IF_in_createKeyspaceStatement2099); 
                    match(input,K_NOT,FOLLOW_K_NOT_in_createKeyspaceStatement2101); 
                    match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createKeyspaceStatement2103); 
                     ifNotExists = true; 

                    }
                    break;

            }

            pushFollow(FOLLOW_keyspaceName_in_createKeyspaceStatement2112);
            ks=keyspaceName();

            state._fsp--;

            match(input,K_WITH,FOLLOW_K_WITH_in_createKeyspaceStatement2120); 
            pushFollow(FOLLOW_properties_in_createKeyspaceStatement2122);
            properties(attrs);

            state._fsp--;

             expr = new CreateKeyspaceStatement(ks, attrs, ifNotExists); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "createKeyspaceStatement"


    // $ANTLR start "createColumnFamilyStatement"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:444:1: createColumnFamilyStatement returns [CreateColumnFamilyStatement.RawStatement expr] : K_CREATE K_COLUMNFAMILY ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName cfamDefinition[expr] ;
    public final CreateColumnFamilyStatement.RawStatement createColumnFamilyStatement() throws RecognitionException {
        CreateColumnFamilyStatement.RawStatement expr = null;

        CFName cf = null;


         boolean ifNotExists = false; 
        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:453:5: ( K_CREATE K_COLUMNFAMILY ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName cfamDefinition[expr] )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:453:7: K_CREATE K_COLUMNFAMILY ( K_IF K_NOT K_EXISTS )? cf= columnFamilyName cfamDefinition[expr]
            {
            match(input,K_CREATE,FOLLOW_K_CREATE_in_createColumnFamilyStatement2157); 
            match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_createColumnFamilyStatement2159); 
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:453:31: ( K_IF K_NOT K_EXISTS )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==K_IF) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:453:32: K_IF K_NOT K_EXISTS
                    {
                    match(input,K_IF,FOLLOW_K_IF_in_createColumnFamilyStatement2162); 
                    match(input,K_NOT,FOLLOW_K_NOT_in_createColumnFamilyStatement2164); 
                    match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createColumnFamilyStatement2166); 
                     ifNotExists = true; 

                    }
                    break;

            }

            pushFollow(FOLLOW_columnFamilyName_in_createColumnFamilyStatement2181);
            cf=columnFamilyName();

            state._fsp--;

             expr = new CreateColumnFamilyStatement.RawStatement(cf, ifNotExists); 
            pushFollow(FOLLOW_cfamDefinition_in_createColumnFamilyStatement2191);
            cfamDefinition(expr);

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "createColumnFamilyStatement"


    // $ANTLR start "cfamDefinition"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:458:1: cfamDefinition[CreateColumnFamilyStatement.RawStatement expr] : '(' cfamColumns[expr] ( ',' ( cfamColumns[expr] )? )* ')' ( K_WITH cfamProperty[expr] ( K_AND cfamProperty[expr] )* )? ;
    public final void cfamDefinition(CreateColumnFamilyStatement.RawStatement expr) throws RecognitionException {
        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:459:5: ( '(' cfamColumns[expr] ( ',' ( cfamColumns[expr] )? )* ')' ( K_WITH cfamProperty[expr] ( K_AND cfamProperty[expr] )* )? )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:459:7: '(' cfamColumns[expr] ( ',' ( cfamColumns[expr] )? )* ')' ( K_WITH cfamProperty[expr] ( K_AND cfamProperty[expr] )* )?
            {
            match(input,133,FOLLOW_133_in_cfamDefinition2210); 
            pushFollow(FOLLOW_cfamColumns_in_cfamDefinition2212);
            cfamColumns(expr);

            state._fsp--;

            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:459:29: ( ',' ( cfamColumns[expr] )? )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==135) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:459:31: ',' ( cfamColumns[expr] )?
            	    {
            	    match(input,135,FOLLOW_135_in_cfamDefinition2217); 
            	    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:459:35: ( cfamColumns[expr] )?
            	    int alt45=2;
            	    int LA45_0 = input.LA(1);

            	    if ( ((LA45_0>=K_COUNT && LA45_0<=K_AS)||(LA45_0>=K_FILTERING && LA45_0<=K_TTL)||LA45_0==K_VALUES||LA45_0==K_TIMESTAMP||LA45_0==K_EXISTS||LA45_0==K_COUNTER||(LA45_0>=K_PRIMARY && LA45_0<=K_CUSTOM)||LA45_0==IDENT||LA45_0==K_TRIGGER||LA45_0==K_TYPE||LA45_0==K_LIST||(LA45_0>=K_ALL && LA45_0<=QUOTED_NAME)||(LA45_0>=K_ASCII && LA45_0<=K_MAP)) ) {
            	        alt45=1;
            	    }
            	    switch (alt45) {
            	        case 1 :
            	            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:459:35: cfamColumns[expr]
            	            {
            	            pushFollow(FOLLOW_cfamColumns_in_cfamDefinition2219);
            	            cfamColumns(expr);

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            match(input,134,FOLLOW_134_in_cfamDefinition2226); 
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:460:7: ( K_WITH cfamProperty[expr] ( K_AND cfamProperty[expr] )* )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==K_WITH) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:460:9: K_WITH cfamProperty[expr] ( K_AND cfamProperty[expr] )*
                    {
                    match(input,K_WITH,FOLLOW_K_WITH_in_cfamDefinition2236); 
                    pushFollow(FOLLOW_cfamProperty_in_cfamDefinition2238);
                    cfamProperty(expr);

                    state._fsp--;

                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:460:35: ( K_AND cfamProperty[expr] )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==K_AND) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:460:37: K_AND cfamProperty[expr]
                    	    {
                    	    match(input,K_AND,FOLLOW_K_AND_in_cfamDefinition2243); 
                    	    pushFollow(FOLLOW_cfamProperty_in_cfamDefinition2245);
                    	    cfamProperty(expr);

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "cfamDefinition"


    // $ANTLR start "cfamColumns"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:463:1: cfamColumns[CreateColumnFamilyStatement.RawStatement expr] : (k= cident v= comparatorType ( K_PRIMARY K_KEY )? | K_PRIMARY K_KEY '(' pkDef[expr] ( ',' c= cident )* ')' );
    public final void cfamColumns(CreateColumnFamilyStatement.RawStatement expr) throws RecognitionException {
        ColumnIdentifier k = null;

        CQL3Type v = null;

        ColumnIdentifier c = null;


        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:464:5: (k= cident v= comparatorType ( K_PRIMARY K_KEY )? | K_PRIMARY K_KEY '(' pkDef[expr] ( ',' c= cident )* ')' )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=K_COUNT && LA51_0<=K_AS)||(LA51_0>=K_FILTERING && LA51_0<=K_TTL)||LA51_0==K_VALUES||LA51_0==K_TIMESTAMP||LA51_0==K_EXISTS||LA51_0==K_COUNTER||(LA51_0>=K_KEY && LA51_0<=K_CUSTOM)||LA51_0==IDENT||LA51_0==K_TRIGGER||LA51_0==K_TYPE||LA51_0==K_LIST||(LA51_0>=K_ALL && LA51_0<=QUOTED_NAME)||(LA51_0>=K_ASCII && LA51_0<=K_MAP)) ) {
                alt51=1;
            }
            else if ( (LA51_0==K_PRIMARY) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:464:7: k= cident v= comparatorType ( K_PRIMARY K_KEY )?
                    {
                    pushFollow(FOLLOW_cident_in_cfamColumns2271);
                    k=cident();

                    state._fsp--;

                    pushFollow(FOLLOW_comparatorType_in_cfamColumns2275);
                    v=comparatorType();

                    state._fsp--;

                     expr.addDefinition(k, v); 
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:464:64: ( K_PRIMARY K_KEY )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==K_PRIMARY) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:464:65: K_PRIMARY K_KEY
                            {
                            match(input,K_PRIMARY,FOLLOW_K_PRIMARY_in_cfamColumns2280); 
                            match(input,K_KEY,FOLLOW_K_KEY_in_cfamColumns2282); 
                             expr.addKeyAliases(Collections.singletonList(k)); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:465:7: K_PRIMARY K_KEY '(' pkDef[expr] ( ',' c= cident )* ')'
                    {
                    match(input,K_PRIMARY,FOLLOW_K_PRIMARY_in_cfamColumns2294); 
                    match(input,K_KEY,FOLLOW_K_KEY_in_cfamColumns2296); 
                    match(input,133,FOLLOW_133_in_cfamColumns2298); 
                    pushFollow(FOLLOW_pkDef_in_cfamColumns2300);
                    pkDef(expr);

                    state._fsp--;

                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:465:39: ( ',' c= cident )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==135) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:465:40: ',' c= cident
                    	    {
                    	    match(input,135,FOLLOW_135_in_cfamColumns2304); 
                    	    pushFollow(FOLLOW_cident_in_cfamColumns2308);
                    	    c=cident();

                    	    state._fsp--;

                    	     expr.addColumnAlias(c); 

                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    match(input,134,FOLLOW_134_in_cfamColumns2315); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "cfamColumns"


    // $ANTLR start "pkDef"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:468:1: pkDef[CreateColumnFamilyStatement.RawStatement expr] : (k= cident | '(' k1= cident ( ',' kn= cident )* ')' );
    public final void pkDef(CreateColumnFamilyStatement.RawStatement expr) throws RecognitionException {
        ColumnIdentifier k = null;

        ColumnIdentifier k1 = null;

        ColumnIdentifier kn = null;


        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:469:5: (k= cident | '(' k1= cident ( ',' kn= cident )* ')' )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=K_COUNT && LA53_0<=K_AS)||(LA53_0>=K_FILTERING && LA53_0<=K_TTL)||LA53_0==K_VALUES||LA53_0==K_TIMESTAMP||LA53_0==K_EXISTS||LA53_0==K_COUNTER||(LA53_0>=K_KEY && LA53_0<=K_CUSTOM)||LA53_0==IDENT||LA53_0==K_TRIGGER||LA53_0==K_TYPE||LA53_0==K_LIST||(LA53_0>=K_ALL && LA53_0<=QUOTED_NAME)||(LA53_0>=K_ASCII && LA53_0<=K_MAP)) ) {
                alt53=1;
            }
            else if ( (LA53_0==133) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:469:7: k= cident
                    {
                    pushFollow(FOLLOW_cident_in_pkDef2335);
                    k=cident();

                    state._fsp--;

                     expr.addKeyAliases(Collections.singletonList(k)); 

                    }
                    break;
                case 2 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:470:7: '(' k1= cident ( ',' kn= cident )* ')'
                    {
                    match(input,133,FOLLOW_133_in_pkDef2345); 
                     List<ColumnIdentifier> l = new ArrayList<ColumnIdentifier>(); 
                    pushFollow(FOLLOW_cident_in_pkDef2351);
                    k1=cident();

                    state._fsp--;

                     l.add(k1); 
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:470:102: ( ',' kn= cident )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==135) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:470:104: ',' kn= cident
                    	    {
                    	    match(input,135,FOLLOW_135_in_pkDef2357); 
                    	    pushFollow(FOLLOW_cident_in_pkDef2361);
                    	    kn=cident();

                    	    state._fsp--;

                    	     l.add(kn); 

                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    match(input,134,FOLLOW_134_in_pkDef2368); 
                     expr.addKeyAliases(l); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "pkDef"


    // $ANTLR start "cfamProperty"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:473:1: cfamProperty[CreateColumnFamilyStatement.RawStatement expr] : ( property[expr.properties] | K_COMPACT K_STORAGE | K_CLUSTERING K_ORDER K_BY '(' cfamOrdering[expr] ( ',' cfamOrdering[expr] )* ')' );
    public final void cfamProperty(CreateColumnFamilyStatement.RawStatement expr) throws RecognitionException {
        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:474:5: ( property[expr.properties] | K_COMPACT K_STORAGE | K_CLUSTERING K_ORDER K_BY '(' cfamOrdering[expr] ( ',' cfamOrdering[expr] )* ')' )
            int alt55=3;
            switch ( input.LA(1) ) {
            case K_COUNT:
            case K_AS:
            case K_FILTERING:
            case K_WRITETIME:
            case K_TTL:
            case K_VALUES:
            case K_TIMESTAMP:
            case K_EXISTS:
            case K_COUNTER:
            case K_KEY:
            case K_STORAGE:
            case K_CUSTOM:
            case IDENT:
            case K_TRIGGER:
            case K_TYPE:
            case K_LIST:
            case K_ALL:
            case K_PERMISSIONS:
            case K_PERMISSION:
            case K_KEYSPACES:
            case K_USER:
            case K_SUPERUSER:
            case K_NOSUPERUSER:
            case K_USERS:
            case K_PASSWORD:
            case QUOTED_NAME:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INET:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
            case K_MAP:
                {
                alt55=1;
                }
                break;
            case K_COMPACT:
                {
                int LA55_2 = input.LA(2);

                if ( (LA55_2==K_STORAGE) ) {
                    alt55=2;
                }
                else if ( (LA55_2==143) ) {
                    alt55=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 2, input);

                    throw nvae;
                }
                }
                break;
            case K_CLUSTERING:
                {
                int LA55_3 = input.LA(2);

                if ( (LA55_3==K_ORDER) ) {
                    alt55=3;
                }
                else if ( (LA55_3==143) ) {
                    alt55=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:474:7: property[expr.properties]
                    {
                    pushFollow(FOLLOW_property_in_cfamProperty2388);
                    property(expr.properties);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:475:7: K_COMPACT K_STORAGE
                    {
                    match(input,K_COMPACT,FOLLOW_K_COMPACT_in_cfamProperty2397); 
                    match(input,K_STORAGE,FOLLOW_K_STORAGE_in_cfamProperty2399); 
                     expr.setCompactStorage(); 

                    }
                    break;
                case 3 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:476:7: K_CLUSTERING K_ORDER K_BY '(' cfamOrdering[expr] ( ',' cfamOrdering[expr] )* ')'
                    {
                    match(input,K_CLUSTERING,FOLLOW_K_CLUSTERING_in_cfamProperty2409); 
                    match(input,K_ORDER,FOLLOW_K_ORDER_in_cfamProperty2411); 
                    match(input,K_BY,FOLLOW_K_BY_in_cfamProperty2413); 
                    match(input,133,FOLLOW_133_in_cfamProperty2415); 
                    pushFollow(FOLLOW_cfamOrdering_in_cfamProperty2417);
                    cfamOrdering(expr);

                    state._fsp--;

                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:476:56: ( ',' cfamOrdering[expr] )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==135) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:476:57: ',' cfamOrdering[expr]
                    	    {
                    	    match(input,135,FOLLOW_135_in_cfamProperty2421); 
                    	    pushFollow(FOLLOW_cfamOrdering_in_cfamProperty2423);
                    	    cfamOrdering(expr);

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    match(input,134,FOLLOW_134_in_cfamProperty2428); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "cfamProperty"


    // $ANTLR start "cfamOrdering"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:479:1: cfamOrdering[CreateColumnFamilyStatement.RawStatement expr] : k= cident ( K_ASC | K_DESC ) ;
    public final void cfamOrdering(CreateColumnFamilyStatement.RawStatement expr) throws RecognitionException {
        ColumnIdentifier k = null;


         boolean reversed=false; 
        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:481:5: (k= cident ( K_ASC | K_DESC ) )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:481:7: k= cident ( K_ASC | K_DESC )
            {
            pushFollow(FOLLOW_cident_in_cfamOrdering2456);
            k=cident();

            state._fsp--;

            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:481:16: ( K_ASC | K_DESC )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==K_ASC) ) {
                alt56=1;
            }
            else if ( (LA56_0==K_DESC) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:481:17: K_ASC
                    {
                    match(input,K_ASC,FOLLOW_K_ASC_in_cfamOrdering2459); 

                    }
                    break;
                case 2 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:481:25: K_DESC
                    {
                    match(input,K_DESC,FOLLOW_K_DESC_in_cfamOrdering2463); 
                     reversed=true;

                    }
                    break;

            }

             expr.setOrdering(k, reversed); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "cfamOrdering"


    // $ANTLR start "createIndexStatement"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:484:1: createIndexStatement returns [CreateIndexStatement expr] : K_CREATE ( K_CUSTOM )? K_INDEX ( K_IF K_NOT K_EXISTS )? (idxName= IDENT )? K_ON cf= columnFamilyName '(' id= cident ')' ( K_USING cls= STRING_LITERAL )? ;
    public final CreateIndexStatement createIndexStatement() throws RecognitionException {
        CreateIndexStatement expr = null;

        Token idxName=null;
        Token cls=null;
        CFName cf = null;

        ColumnIdentifier id = null;



                boolean isCustom = false;
                boolean ifNotExists = false;
            
        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:493:5: ( K_CREATE ( K_CUSTOM )? K_INDEX ( K_IF K_NOT K_EXISTS )? (idxName= IDENT )? K_ON cf= columnFamilyName '(' id= cident ')' ( K_USING cls= STRING_LITERAL )? )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:493:7: K_CREATE ( K_CUSTOM )? K_INDEX ( K_IF K_NOT K_EXISTS )? (idxName= IDENT )? K_ON cf= columnFamilyName '(' id= cident ')' ( K_USING cls= STRING_LITERAL )?
            {
            match(input,K_CREATE,FOLLOW_K_CREATE_in_createIndexStatement2501); 
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:493:16: ( K_CUSTOM )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==K_CUSTOM) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:493:17: K_CUSTOM
                    {
                    match(input,K_CUSTOM,FOLLOW_K_CUSTOM_in_createIndexStatement2504); 
                     isCustom = true; 

                    }
                    break;

            }

            match(input,K_INDEX,FOLLOW_K_INDEX_in_createIndexStatement2510); 
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:493:57: ( K_IF K_NOT K_EXISTS )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==K_IF) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:493:58: K_IF K_NOT K_EXISTS
                    {
                    match(input,K_IF,FOLLOW_K_IF_in_createIndexStatement2513); 
                    match(input,K_NOT,FOLLOW_K_NOT_in_createIndexStatement2515); 
                    match(input,K_EXISTS,FOLLOW_K_EXISTS_in_createIndexStatement2517); 
                     ifNotExists = true; 

                    }
                    break;

            }

            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:494:9: (idxName= IDENT )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==IDENT) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:494:10: idxName= IDENT
                    {
                    idxName=(Token)match(input,IDENT,FOLLOW_IDENT_in_createIndexStatement2535); 

                    }
                    break;

            }

            match(input,K_ON,FOLLOW_K_ON_in_createIndexStatement2539); 
            pushFollow(FOLLOW_columnFamilyName_in_createIndexStatement2543);
            cf=columnFamilyName();

            state._fsp--;

            match(input,133,FOLLOW_133_in_createIndexStatement2545); 
            pushFollow(FOLLOW_cident_in_createIndexStatement2549);
            id=cident();

            state._fsp--;

            match(input,134,FOLLOW_134_in_createIndexStatement2551); 
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:495:9: ( K_USING cls= STRING_LITERAL )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==K_USING) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:495:11: K_USING cls= STRING_LITERAL
                    {
                    match(input,K_USING,FOLLOW_K_USING_in_createIndexStatement2563); 
                    cls=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_createIndexStatement2567); 

                    }
                    break;

            }

             expr = new CreateIndexStatement(cf, (idxName!=null?idxName.getText():null), id, ifNotExists, isCustom, (cls!=null?cls.getText():null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "createIndexStatement"


    // $ANTLR start "createTriggerStatement"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:499:1: createTriggerStatement returns [CreateTriggerStatement expr] : K_CREATE K_TRIGGER (tn= IDENT ) K_ON cf= columnFamilyName K_USING tc1= STRING_LITERAL ;
    public final CreateTriggerStatement createTriggerStatement() throws RecognitionException {
        CreateTriggerStatement expr = null;

        Token tn=null;
        Token tc1=null;
        CFName cf = null;


        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:503:5: ( K_CREATE K_TRIGGER (tn= IDENT ) K_ON cf= columnFamilyName K_USING tc1= STRING_LITERAL )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:503:7: K_CREATE K_TRIGGER (tn= IDENT ) K_ON cf= columnFamilyName K_USING tc1= STRING_LITERAL
            {
            match(input,K_CREATE,FOLLOW_K_CREATE_in_createTriggerStatement2601); 
            match(input,K_TRIGGER,FOLLOW_K_TRIGGER_in_createTriggerStatement2603); 
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:503:26: (tn= IDENT )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:503:27: tn= IDENT
            {
            tn=(Token)match(input,IDENT,FOLLOW_IDENT_in_createTriggerStatement2608); 

            }

            match(input,K_ON,FOLLOW_K_ON_in_createTriggerStatement2611); 
            pushFollow(FOLLOW_columnFamilyName_in_createTriggerStatement2615);
            cf=columnFamilyName();

            state._fsp--;

            match(input,K_USING,FOLLOW_K_USING_in_createTriggerStatement2617); 
            tc1=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_createTriggerStatement2621); 
             expr = new CreateTriggerStatement(cf, (tn!=null?tn.getText():null), (tc1!=null?tc1.getText():null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "createTriggerStatement"


    // $ANTLR start "dropTriggerStatement"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:507:1: dropTriggerStatement returns [DropTriggerStatement expr] : K_DROP K_TRIGGER (tn= IDENT ) K_ON cf= columnFamilyName ;
    public final DropTriggerStatement dropTriggerStatement() throws RecognitionException {
        DropTriggerStatement expr = null;

        Token tn=null;
        CFName cf = null;


        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:511:5: ( K_DROP K_TRIGGER (tn= IDENT ) K_ON cf= columnFamilyName )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:511:7: K_DROP K_TRIGGER (tn= IDENT ) K_ON cf= columnFamilyName
            {
            match(input,K_DROP,FOLLOW_K_DROP_in_dropTriggerStatement2652); 
            match(input,K_TRIGGER,FOLLOW_K_TRIGGER_in_dropTriggerStatement2654); 
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:511:24: (tn= IDENT )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:511:25: tn= IDENT
            {
            tn=(Token)match(input,IDENT,FOLLOW_IDENT_in_dropTriggerStatement2659); 

            }

            match(input,K_ON,FOLLOW_K_ON_in_dropTriggerStatement2662); 
            pushFollow(FOLLOW_columnFamilyName_in_dropTriggerStatement2666);
            cf=columnFamilyName();

            state._fsp--;

             expr = new DropTriggerStatement(cf, (tn!=null?tn.getText():null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "dropTriggerStatement"


    // $ANTLR start "alterKeyspaceStatement"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:515:1: alterKeyspaceStatement returns [AlterKeyspaceStatement expr] : K_ALTER K_KEYSPACE ks= keyspaceName K_WITH properties[attrs] ;
    public final AlterKeyspaceStatement alterKeyspaceStatement() throws RecognitionException {
        AlterKeyspaceStatement expr = null;

        String ks = null;


         KSPropDefs attrs = new KSPropDefs(); 
        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:520:5: ( K_ALTER K_KEYSPACE ks= keyspaceName K_WITH properties[attrs] )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:520:7: K_ALTER K_KEYSPACE ks= keyspaceName K_WITH properties[attrs]
            {
            match(input,K_ALTER,FOLLOW_K_ALTER_in_alterKeyspaceStatement2706); 
            match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_alterKeyspaceStatement2708); 
            pushFollow(FOLLOW_keyspaceName_in_alterKeyspaceStatement2712);
            ks=keyspaceName();

            state._fsp--;

            match(input,K_WITH,FOLLOW_K_WITH_in_alterKeyspaceStatement2722); 
            pushFollow(FOLLOW_properties_in_alterKeyspaceStatement2724);
            properties(attrs);

            state._fsp--;

             expr = new AlterKeyspaceStatement(ks, attrs); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "alterKeyspaceStatement"


    // $ANTLR start "alterTableStatement"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:525:1: alterTableStatement returns [AlterTableStatement expr] : K_ALTER K_COLUMNFAMILY cf= columnFamilyName ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD id= cident v= comparatorType | K_DROP id= cident | K_WITH properties[props] | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* ) ;
    public final AlterTableStatement alterTableStatement() throws RecognitionException {
        AlterTableStatement expr = null;

        CFName cf = null;

        ColumnIdentifier id = null;

        CQL3Type v = null;

        ColumnIdentifier id1 = null;

        ColumnIdentifier toId1 = null;

        ColumnIdentifier idn = null;

        ColumnIdentifier toIdn = null;



                AlterTableStatement.Type type = null;
                CFPropDefs props = new CFPropDefs();
                Map<ColumnIdentifier, ColumnIdentifier> renames = new HashMap<ColumnIdentifier, ColumnIdentifier>();
            
        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:538:5: ( K_ALTER K_COLUMNFAMILY cf= columnFamilyName ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD id= cident v= comparatorType | K_DROP id= cident | K_WITH properties[props] | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* ) )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:538:7: K_ALTER K_COLUMNFAMILY cf= columnFamilyName ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD id= cident v= comparatorType | K_DROP id= cident | K_WITH properties[props] | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* )
            {
            match(input,K_ALTER,FOLLOW_K_ALTER_in_alterTableStatement2760); 
            match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_alterTableStatement2762); 
            pushFollow(FOLLOW_columnFamilyName_in_alterTableStatement2766);
            cf=columnFamilyName();

            state._fsp--;

            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:539:11: ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD id= cident v= comparatorType | K_DROP id= cident | K_WITH properties[props] | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* )
            int alt62=5;
            switch ( input.LA(1) ) {
            case K_ALTER:
                {
                alt62=1;
                }
                break;
            case K_ADD:
                {
                alt62=2;
                }
                break;
            case K_DROP:
                {
                alt62=3;
                }
                break;
            case K_WITH:
                {
                alt62=4;
                }
                break;
            case K_RENAME:
                {
                alt62=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:539:13: K_ALTER id= cident K_TYPE v= comparatorType
                    {
                    match(input,K_ALTER,FOLLOW_K_ALTER_in_alterTableStatement2780); 
                    pushFollow(FOLLOW_cident_in_alterTableStatement2784);
                    id=cident();

                    state._fsp--;

                    match(input,K_TYPE,FOLLOW_K_TYPE_in_alterTableStatement2786); 
                    pushFollow(FOLLOW_comparatorType_in_alterTableStatement2790);
                    v=comparatorType();

                    state._fsp--;

                     type = AlterTableStatement.Type.ALTER; 

                    }
                    break;
                case 2 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:540:13: K_ADD id= cident v= comparatorType
                    {
                    match(input,K_ADD,FOLLOW_K_ADD_in_alterTableStatement2806); 
                    pushFollow(FOLLOW_cident_in_alterTableStatement2812);
                    id=cident();

                    state._fsp--;

                    pushFollow(FOLLOW_comparatorType_in_alterTableStatement2816);
                    v=comparatorType();

                    state._fsp--;

                     type = AlterTableStatement.Type.ADD; 

                    }
                    break;
                case 3 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:541:13: K_DROP id= cident
                    {
                    match(input,K_DROP,FOLLOW_K_DROP_in_alterTableStatement2839); 
                    pushFollow(FOLLOW_cident_in_alterTableStatement2844);
                    id=cident();

                    state._fsp--;

                     type = AlterTableStatement.Type.DROP; 

                    }
                    break;
                case 4 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:542:13: K_WITH properties[props]
                    {
                    match(input,K_WITH,FOLLOW_K_WITH_in_alterTableStatement2884); 
                    pushFollow(FOLLOW_properties_in_alterTableStatement2887);
                    properties(props);

                    state._fsp--;

                     type = AlterTableStatement.Type.OPTS; 

                    }
                    break;
                case 5 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:543:13: K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )*
                    {
                    match(input,K_RENAME,FOLLOW_K_RENAME_in_alterTableStatement2920); 
                     type = AlterTableStatement.Type.RENAME; 
                    pushFollow(FOLLOW_cident_in_alterTableStatement2974);
                    id1=cident();

                    state._fsp--;

                    match(input,K_TO,FOLLOW_K_TO_in_alterTableStatement2976); 
                    pushFollow(FOLLOW_cident_in_alterTableStatement2980);
                    toId1=cident();

                    state._fsp--;

                     renames.put(id1, toId1); 
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:545:16: ( K_AND idn= cident K_TO toIdn= cident )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==K_AND) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:545:18: K_AND idn= cident K_TO toIdn= cident
                    	    {
                    	    match(input,K_AND,FOLLOW_K_AND_in_alterTableStatement3001); 
                    	    pushFollow(FOLLOW_cident_in_alterTableStatement3005);
                    	    idn=cident();

                    	    state._fsp--;

                    	    match(input,K_TO,FOLLOW_K_TO_in_alterTableStatement3007); 
                    	    pushFollow(FOLLOW_cident_in_alterTableStatement3011);
                    	    toIdn=cident();

                    	    state._fsp--;

                    	     renames.put(idn, toIdn); 

                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);


                    }
                    break;

            }


                    expr = new AlterTableStatement(cf, type, id, v, props, renames);
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "alterTableStatement"


    // $ANTLR start "dropKeyspaceStatement"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:552:1: dropKeyspaceStatement returns [DropKeyspaceStatement ksp] : K_DROP K_KEYSPACE ( K_IF K_EXISTS )? ks= keyspaceName ;
    public final DropKeyspaceStatement dropKeyspaceStatement() throws RecognitionException {
        DropKeyspaceStatement ksp = null;

        String ks = null;


         boolean ifExists = false; 
        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:557:5: ( K_DROP K_KEYSPACE ( K_IF K_EXISTS )? ks= keyspaceName )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:557:7: K_DROP K_KEYSPACE ( K_IF K_EXISTS )? ks= keyspaceName
            {
            match(input,K_DROP,FOLLOW_K_DROP_in_dropKeyspaceStatement3066); 
            match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_dropKeyspaceStatement3068); 
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:557:25: ( K_IF K_EXISTS )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==K_IF) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:557:26: K_IF K_EXISTS
                    {
                    match(input,K_IF,FOLLOW_K_IF_in_dropKeyspaceStatement3071); 
                    match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropKeyspaceStatement3073); 
                     ifExists = true; 

                    }
                    break;

            }

            pushFollow(FOLLOW_keyspaceName_in_dropKeyspaceStatement3082);
            ks=keyspaceName();

            state._fsp--;

             ksp = new DropKeyspaceStatement(ks, ifExists); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ksp;
    }
    // $ANTLR end "dropKeyspaceStatement"


    // $ANTLR start "dropColumnFamilyStatement"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:560:1: dropColumnFamilyStatement returns [DropColumnFamilyStatement stmt] : K_DROP K_COLUMNFAMILY ( K_IF K_EXISTS )? cf= columnFamilyName ;
    public final DropColumnFamilyStatement dropColumnFamilyStatement() throws RecognitionException {
        DropColumnFamilyStatement stmt = null;

        CFName cf = null;


         boolean ifExists = false; 
        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:565:5: ( K_DROP K_COLUMNFAMILY ( K_IF K_EXISTS )? cf= columnFamilyName )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:565:7: K_DROP K_COLUMNFAMILY ( K_IF K_EXISTS )? cf= columnFamilyName
            {
            match(input,K_DROP,FOLLOW_K_DROP_in_dropColumnFamilyStatement3116); 
            match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_dropColumnFamilyStatement3118); 
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:565:29: ( K_IF K_EXISTS )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==K_IF) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:565:30: K_IF K_EXISTS
                    {
                    match(input,K_IF,FOLLOW_K_IF_in_dropColumnFamilyStatement3121); 
                    match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropColumnFamilyStatement3123); 
                     ifExists = true; 

                    }
                    break;

            }

            pushFollow(FOLLOW_columnFamilyName_in_dropColumnFamilyStatement3132);
            cf=columnFamilyName();

            state._fsp--;

             stmt = new DropColumnFamilyStatement(cf, ifExists); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "dropColumnFamilyStatement"


    // $ANTLR start "dropIndexStatement"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:568:1: dropIndexStatement returns [DropIndexStatement expr] : K_DROP K_INDEX ( K_IF K_EXISTS )? index= IDENT ;
    public final DropIndexStatement dropIndexStatement() throws RecognitionException {
        DropIndexStatement expr = null;

        Token index=null;

         boolean ifExists = false; 
        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:573:5: ( K_DROP K_INDEX ( K_IF K_EXISTS )? index= IDENT )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:573:7: K_DROP K_INDEX ( K_IF K_EXISTS )? index= IDENT
            {
            match(input,K_DROP,FOLLOW_K_DROP_in_dropIndexStatement3166); 
            match(input,K_INDEX,FOLLOW_K_INDEX_in_dropIndexStatement3168); 
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:573:22: ( K_IF K_EXISTS )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==K_IF) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:573:23: K_IF K_EXISTS
                    {
                    match(input,K_IF,FOLLOW_K_IF_in_dropIndexStatement3171); 
                    match(input,K_EXISTS,FOLLOW_K_EXISTS_in_dropIndexStatement3173); 
                     ifExists = true; 

                    }
                    break;

            }

            index=(Token)match(input,IDENT,FOLLOW_IDENT_in_dropIndexStatement3182); 
             expr = new DropIndexStatement((index!=null?index.getText():null), ifExists); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "dropIndexStatement"


    // $ANTLR start "truncateStatement"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:577:1: truncateStatement returns [TruncateStatement stmt] : K_TRUNCATE cf= columnFamilyName ;
    public final TruncateStatement truncateStatement() throws RecognitionException {
        TruncateStatement stmt = null;

        CFName cf = null;


        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:581:5: ( K_TRUNCATE cf= columnFamilyName )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:581:7: K_TRUNCATE cf= columnFamilyName
            {
            match(input,K_TRUNCATE,FOLLOW_K_TRUNCATE_in_truncateStatement3213); 
            pushFollow(FOLLOW_columnFamilyName_in_truncateStatement3217);
            cf=columnFamilyName();

            state._fsp--;

             stmt = new TruncateStatement(cf); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "truncateStatement"


    // $ANTLR start "grantStatement"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:584:1: grantStatement returns [GrantStatement stmt] : K_GRANT permissionOrAll K_ON resource K_TO username ;
    public final GrantStatement grantStatement() throws RecognitionException {
        GrantStatement stmt = null;

        Set<Permission> permissionOrAll1 = null;

        IResource resource2 = null;

        CqlParser.username_return username3 = null;


        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:588:5: ( K_GRANT permissionOrAll K_ON resource K_TO username )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:588:7: K_GRANT permissionOrAll K_ON resource K_TO username
            {
            match(input,K_GRANT,FOLLOW_K_GRANT_in_grantStatement3242); 
            pushFollow(FOLLOW_permissionOrAll_in_grantStatement3254);
            permissionOrAll1=permissionOrAll();

            state._fsp--;

            match(input,K_ON,FOLLOW_K_ON_in_grantStatement3262); 
            pushFollow(FOLLOW_resource_in_grantStatement3274);
            resource2=resource();

            state._fsp--;

            match(input,K_TO,FOLLOW_K_TO_in_grantStatement3282); 
            pushFollow(FOLLOW_username_in_grantStatement3294);
            username3=username();

            state._fsp--;

             stmt = new GrantStatement(permissionOrAll1, resource2, (username3!=null?input.toString(username3.start,username3.stop):null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "grantStatement"


    // $ANTLR start "revokeStatement"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:597:1: revokeStatement returns [RevokeStatement stmt] : K_REVOKE permissionOrAll K_ON resource K_FROM username ;
    public final RevokeStatement revokeStatement() throws RecognitionException {
        RevokeStatement stmt = null;

        Set<Permission> permissionOrAll4 = null;

        IResource resource5 = null;

        CqlParser.username_return username6 = null;


        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:601:5: ( K_REVOKE permissionOrAll K_ON resource K_FROM username )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:601:7: K_REVOKE permissionOrAll K_ON resource K_FROM username
            {
            match(input,K_REVOKE,FOLLOW_K_REVOKE_in_revokeStatement3325); 
            pushFollow(FOLLOW_permissionOrAll_in_revokeStatement3337);
            permissionOrAll4=permissionOrAll();

            state._fsp--;

            match(input,K_ON,FOLLOW_K_ON_in_revokeStatement3345); 
            pushFollow(FOLLOW_resource_in_revokeStatement3357);
            resource5=resource();

            state._fsp--;

            match(input,K_FROM,FOLLOW_K_FROM_in_revokeStatement3365); 
            pushFollow(FOLLOW_username_in_revokeStatement3377);
            username6=username();

            state._fsp--;

             stmt = new RevokeStatement(permissionOrAll4, resource5, (username6!=null?input.toString(username6.start,username6.stop):null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "revokeStatement"


    // $ANTLR start "listPermissionsStatement"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:610:1: listPermissionsStatement returns [ListPermissionsStatement stmt] : K_LIST permissionOrAll ( K_ON resource )? ( K_OF username )? ( K_NORECURSIVE )? ;
    public final ListPermissionsStatement listPermissionsStatement() throws RecognitionException {
        ListPermissionsStatement stmt = null;

        IResource resource7 = null;

        CqlParser.username_return username8 = null;

        Set<Permission> permissionOrAll9 = null;



                IResource resource = null;
                String username = null;
                boolean recursive = true;
            
        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:616:5: ( K_LIST permissionOrAll ( K_ON resource )? ( K_OF username )? ( K_NORECURSIVE )? )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:616:7: K_LIST permissionOrAll ( K_ON resource )? ( K_OF username )? ( K_NORECURSIVE )?
            {
            match(input,K_LIST,FOLLOW_K_LIST_in_listPermissionsStatement3415); 
            pushFollow(FOLLOW_permissionOrAll_in_listPermissionsStatement3427);
            permissionOrAll9=permissionOrAll();

            state._fsp--;

            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:618:7: ( K_ON resource )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==K_ON) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:618:9: K_ON resource
                    {
                    match(input,K_ON,FOLLOW_K_ON_in_listPermissionsStatement3437); 
                    pushFollow(FOLLOW_resource_in_listPermissionsStatement3439);
                    resource7=resource();

                    state._fsp--;

                     resource = resource7; 

                    }
                    break;

            }

            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:619:7: ( K_OF username )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==K_OF) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:619:9: K_OF username
                    {
                    match(input,K_OF,FOLLOW_K_OF_in_listPermissionsStatement3454); 
                    pushFollow(FOLLOW_username_in_listPermissionsStatement3456);
                    username8=username();

                    state._fsp--;

                     username = (username8!=null?input.toString(username8.start,username8.stop):null); 

                    }
                    break;

            }

            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:620:7: ( K_NORECURSIVE )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==K_NORECURSIVE) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:620:9: K_NORECURSIVE
                    {
                    match(input,K_NORECURSIVE,FOLLOW_K_NORECURSIVE_in_listPermissionsStatement3471); 
                     recursive = false; 

                    }
                    break;

            }

             stmt = new ListPermissionsStatement(permissionOrAll9, resource, username, recursive); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "listPermissionsStatement"


    // $ANTLR start "permission"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:624:1: permission returns [Permission perm] : p= ( K_CREATE | K_ALTER | K_DROP | K_SELECT | K_MODIFY | K_AUTHORIZE ) ;
    public final Permission permission() throws RecognitionException {
        Permission perm = null;

        Token p=null;

        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:625:5: (p= ( K_CREATE | K_ALTER | K_DROP | K_SELECT | K_MODIFY | K_AUTHORIZE ) )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:625:7: p= ( K_CREATE | K_ALTER | K_DROP | K_SELECT | K_MODIFY | K_AUTHORIZE )
            {
            p=(Token)input.LT(1);
            if ( input.LA(1)==K_SELECT||input.LA(1)==K_CREATE||(input.LA(1)>=K_DROP && input.LA(1)<=K_ALTER)||(input.LA(1)>=K_MODIFY && input.LA(1)<=K_AUTHORIZE) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             perm = Permission.valueOf((p!=null?p.getText():null).toUpperCase()); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return perm;
    }
    // $ANTLR end "permission"


    // $ANTLR start "permissionOrAll"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:629:1: permissionOrAll returns [Set<Permission> perms] : ( K_ALL ( K_PERMISSIONS )? | p= permission ( K_PERMISSION )? );
    public final Set<Permission> permissionOrAll() throws RecognitionException {
        Set<Permission> perms = null;

        Permission p = null;


        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:630:5: ( K_ALL ( K_PERMISSIONS )? | p= permission ( K_PERMISSION )? )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==K_ALL) ) {
                alt71=1;
            }
            else if ( (LA71_0==K_SELECT||LA71_0==K_CREATE||(LA71_0>=K_DROP && LA71_0<=K_ALTER)||(LA71_0>=K_MODIFY && LA71_0<=K_AUTHORIZE)) ) {
                alt71=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:630:7: K_ALL ( K_PERMISSIONS )?
                    {
                    match(input,K_ALL,FOLLOW_K_ALL_in_permissionOrAll3556); 
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:630:13: ( K_PERMISSIONS )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==K_PERMISSIONS) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:630:15: K_PERMISSIONS
                            {
                            match(input,K_PERMISSIONS,FOLLOW_K_PERMISSIONS_in_permissionOrAll3560); 

                            }
                            break;

                    }

                     perms = Permission.ALL_DATA; 

                    }
                    break;
                case 2 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:631:7: p= permission ( K_PERMISSION )?
                    {
                    pushFollow(FOLLOW_permission_in_permissionOrAll3581);
                    p=permission();

                    state._fsp--;

                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:631:20: ( K_PERMISSION )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==K_PERMISSION) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:631:22: K_PERMISSION
                            {
                            match(input,K_PERMISSION,FOLLOW_K_PERMISSION_in_permissionOrAll3585); 

                            }
                            break;

                    }

                     perms = EnumSet.of(p); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return perms;
    }
    // $ANTLR end "permissionOrAll"


    // $ANTLR start "resource"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:634:1: resource returns [IResource res] : r= dataResource ;
    public final IResource resource() throws RecognitionException {
        IResource res = null;

        DataResource r = null;


        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:635:5: (r= dataResource )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:635:7: r= dataResource
            {
            pushFollow(FOLLOW_dataResource_in_resource3613);
            r=dataResource();

            state._fsp--;

             res = r; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return res;
    }
    // $ANTLR end "resource"


    // $ANTLR start "dataResource"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:638:1: dataResource returns [DataResource res] : ( K_ALL K_KEYSPACES | K_KEYSPACE ks= keyspaceName | ( K_COLUMNFAMILY )? cf= columnFamilyName );
    public final DataResource dataResource() throws RecognitionException {
        DataResource res = null;

        String ks = null;

        CFName cf = null;


        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:639:5: ( K_ALL K_KEYSPACES | K_KEYSPACE ks= keyspaceName | ( K_COLUMNFAMILY )? cf= columnFamilyName )
            int alt73=3;
            switch ( input.LA(1) ) {
            case K_ALL:
                {
                int LA73_1 = input.LA(2);

                if ( (LA73_1==K_KEYSPACES) ) {
                    alt73=1;
                }
                else if ( (LA73_1==EOF||LA73_1==K_FROM||LA73_1==K_TO||(LA73_1>=K_OF && LA73_1<=K_NORECURSIVE)||LA73_1==132||LA73_1==139) ) {
                    alt73=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 1, input);

                    throw nvae;
                }
                }
                break;
            case K_KEYSPACE:
                {
                alt73=2;
                }
                break;
            case K_COUNT:
            case K_AS:
            case K_FILTERING:
            case K_WRITETIME:
            case K_TTL:
            case K_VALUES:
            case K_TIMESTAMP:
            case K_EXISTS:
            case K_COUNTER:
            case K_COLUMNFAMILY:
            case K_KEY:
            case K_COMPACT:
            case K_STORAGE:
            case K_CLUSTERING:
            case K_CUSTOM:
            case IDENT:
            case K_TRIGGER:
            case K_TYPE:
            case K_LIST:
            case K_PERMISSIONS:
            case K_PERMISSION:
            case K_KEYSPACES:
            case K_USER:
            case K_SUPERUSER:
            case K_NOSUPERUSER:
            case K_USERS:
            case K_PASSWORD:
            case QUOTED_NAME:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INET:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
            case K_MAP:
                {
                alt73=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:639:7: K_ALL K_KEYSPACES
                    {
                    match(input,K_ALL,FOLLOW_K_ALL_in_dataResource3636); 
                    match(input,K_KEYSPACES,FOLLOW_K_KEYSPACES_in_dataResource3638); 
                     res = DataResource.root(); 

                    }
                    break;
                case 2 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:640:7: K_KEYSPACE ks= keyspaceName
                    {
                    match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_dataResource3648); 
                    pushFollow(FOLLOW_keyspaceName_in_dataResource3654);
                    ks=keyspaceName();

                    state._fsp--;

                     res = DataResource.keyspace(ks); 

                    }
                    break;
                case 3 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:641:7: ( K_COLUMNFAMILY )? cf= columnFamilyName
                    {
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:641:7: ( K_COLUMNFAMILY )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==K_COLUMNFAMILY) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:641:9: K_COLUMNFAMILY
                            {
                            match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_dataResource3666); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_columnFamilyName_in_dataResource3675);
                    cf=columnFamilyName();

                    state._fsp--;

                     res = DataResource.columnFamily(cf.getKeyspace(), cf.getColumnFamily()); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return res;
    }
    // $ANTLR end "dataResource"


    // $ANTLR start "createUserStatement"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:645:1: createUserStatement returns [CreateUserStatement stmt] : K_CREATE K_USER username ( K_WITH userOptions[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? ;
    public final CreateUserStatement createUserStatement() throws RecognitionException {
        CreateUserStatement stmt = null;

        CqlParser.username_return username10 = null;



                UserOptions opts = new UserOptions();
                boolean superuser = false;
            
        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:653:5: ( K_CREATE K_USER username ( K_WITH userOptions[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:653:7: K_CREATE K_USER username ( K_WITH userOptions[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )?
            {
            match(input,K_CREATE,FOLLOW_K_CREATE_in_createUserStatement3715); 
            match(input,K_USER,FOLLOW_K_USER_in_createUserStatement3717); 
            pushFollow(FOLLOW_username_in_createUserStatement3719);
            username10=username();

            state._fsp--;

            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:654:7: ( K_WITH userOptions[opts] )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==K_WITH) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:654:9: K_WITH userOptions[opts]
                    {
                    match(input,K_WITH,FOLLOW_K_WITH_in_createUserStatement3729); 
                    pushFollow(FOLLOW_userOptions_in_createUserStatement3731);
                    userOptions(opts);

                    state._fsp--;


                    }
                    break;

            }

            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:655:7: ( K_SUPERUSER | K_NOSUPERUSER )?
            int alt75=3;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==K_SUPERUSER) ) {
                alt75=1;
            }
            else if ( (LA75_0==K_NOSUPERUSER) ) {
                alt75=2;
            }
            switch (alt75) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:655:9: K_SUPERUSER
                    {
                    match(input,K_SUPERUSER,FOLLOW_K_SUPERUSER_in_createUserStatement3745); 
                     superuser = true; 

                    }
                    break;
                case 2 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:655:45: K_NOSUPERUSER
                    {
                    match(input,K_NOSUPERUSER,FOLLOW_K_NOSUPERUSER_in_createUserStatement3751); 
                     superuser = false; 

                    }
                    break;

            }

             stmt = new CreateUserStatement((username10!=null?input.toString(username10.start,username10.stop):null), opts, superuser); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "createUserStatement"


    // $ANTLR start "alterUserStatement"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:659:1: alterUserStatement returns [AlterUserStatement stmt] : K_ALTER K_USER username ( K_WITH userOptions[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? ;
    public final AlterUserStatement alterUserStatement() throws RecognitionException {
        AlterUserStatement stmt = null;

        CqlParser.username_return username11 = null;



                UserOptions opts = new UserOptions();
                Boolean superuser = null;
            
        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:667:5: ( K_ALTER K_USER username ( K_WITH userOptions[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:667:7: K_ALTER K_USER username ( K_WITH userOptions[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )?
            {
            match(input,K_ALTER,FOLLOW_K_ALTER_in_alterUserStatement3796); 
            match(input,K_USER,FOLLOW_K_USER_in_alterUserStatement3798); 
            pushFollow(FOLLOW_username_in_alterUserStatement3800);
            username11=username();

            state._fsp--;

            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:668:7: ( K_WITH userOptions[opts] )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==K_WITH) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:668:9: K_WITH userOptions[opts]
                    {
                    match(input,K_WITH,FOLLOW_K_WITH_in_alterUserStatement3810); 
                    pushFollow(FOLLOW_userOptions_in_alterUserStatement3812);
                    userOptions(opts);

                    state._fsp--;


                    }
                    break;

            }

            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:669:7: ( K_SUPERUSER | K_NOSUPERUSER )?
            int alt77=3;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==K_SUPERUSER) ) {
                alt77=1;
            }
            else if ( (LA77_0==K_NOSUPERUSER) ) {
                alt77=2;
            }
            switch (alt77) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:669:9: K_SUPERUSER
                    {
                    match(input,K_SUPERUSER,FOLLOW_K_SUPERUSER_in_alterUserStatement3826); 
                     superuser = true; 

                    }
                    break;
                case 2 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:669:45: K_NOSUPERUSER
                    {
                    match(input,K_NOSUPERUSER,FOLLOW_K_NOSUPERUSER_in_alterUserStatement3832); 
                     superuser = false; 

                    }
                    break;

            }

             stmt = new AlterUserStatement((username11!=null?input.toString(username11.start,username11.stop):null), opts, superuser); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "alterUserStatement"


    // $ANTLR start "dropUserStatement"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:673:1: dropUserStatement returns [DropUserStatement stmt] : K_DROP K_USER username ;
    public final DropUserStatement dropUserStatement() throws RecognitionException {
        DropUserStatement stmt = null;

        CqlParser.username_return username12 = null;


        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:677:5: ( K_DROP K_USER username )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:677:7: K_DROP K_USER username
            {
            match(input,K_DROP,FOLLOW_K_DROP_in_dropUserStatement3868); 
            match(input,K_USER,FOLLOW_K_USER_in_dropUserStatement3870); 
            pushFollow(FOLLOW_username_in_dropUserStatement3872);
            username12=username();

            state._fsp--;

             stmt = new DropUserStatement((username12!=null?input.toString(username12.start,username12.stop):null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "dropUserStatement"


    // $ANTLR start "listUsersStatement"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:680:1: listUsersStatement returns [ListUsersStatement stmt] : K_LIST K_USERS ;
    public final ListUsersStatement listUsersStatement() throws RecognitionException {
        ListUsersStatement stmt = null;

        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:684:5: ( K_LIST K_USERS )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:684:7: K_LIST K_USERS
            {
            match(input,K_LIST,FOLLOW_K_LIST_in_listUsersStatement3897); 
            match(input,K_USERS,FOLLOW_K_USERS_in_listUsersStatement3899); 
             stmt = new ListUsersStatement(); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "listUsersStatement"


    // $ANTLR start "userOptions"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:687:1: userOptions[UserOptions opts] : userOption[opts] ;
    public final void userOptions(UserOptions opts) throws RecognitionException {
        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:688:5: ( userOption[opts] )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:688:7: userOption[opts]
            {
            pushFollow(FOLLOW_userOption_in_userOptions3919);
            userOption(opts);

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "userOptions"


    // $ANTLR start "userOption"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:691:1: userOption[UserOptions opts] : k= K_PASSWORD v= STRING_LITERAL ;
    public final void userOption(UserOptions opts) throws RecognitionException {
        Token k=null;
        Token v=null;

        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:692:5: (k= K_PASSWORD v= STRING_LITERAL )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:692:7: k= K_PASSWORD v= STRING_LITERAL
            {
            k=(Token)match(input,K_PASSWORD,FOLLOW_K_PASSWORD_in_userOption3940); 
            v=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_userOption3944); 
             opts.put((k!=null?k.getText():null), (v!=null?v.getText():null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "userOption"


    // $ANTLR start "cident"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:695:1: cident returns [ColumnIdentifier id] : (t= IDENT | t= QUOTED_NAME | k= unreserved_keyword );
    public final ColumnIdentifier cident() throws RecognitionException {
        ColumnIdentifier id = null;

        Token t=null;
        String k = null;


        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:699:5: (t= IDENT | t= QUOTED_NAME | k= unreserved_keyword )
            int alt78=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt78=1;
                }
                break;
            case QUOTED_NAME:
                {
                alt78=2;
                }
                break;
            case K_COUNT:
            case K_AS:
            case K_FILTERING:
            case K_WRITETIME:
            case K_TTL:
            case K_VALUES:
            case K_TIMESTAMP:
            case K_EXISTS:
            case K_COUNTER:
            case K_KEY:
            case K_COMPACT:
            case K_STORAGE:
            case K_CLUSTERING:
            case K_CUSTOM:
            case K_TRIGGER:
            case K_TYPE:
            case K_LIST:
            case K_ALL:
            case K_PERMISSIONS:
            case K_PERMISSION:
            case K_KEYSPACES:
            case K_USER:
            case K_SUPERUSER:
            case K_NOSUPERUSER:
            case K_USERS:
            case K_PASSWORD:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INET:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
            case K_MAP:
                {
                alt78=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:699:7: t= IDENT
                    {
                    t=(Token)match(input,IDENT,FOLLOW_IDENT_in_cident3973); 
                     id = new ColumnIdentifier((t!=null?t.getText():null), false); 

                    }
                    break;
                case 2 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:700:7: t= QUOTED_NAME
                    {
                    t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_cident3998); 
                     id = new ColumnIdentifier((t!=null?t.getText():null), true); 

                    }
                    break;
                case 3 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:701:7: k= unreserved_keyword
                    {
                    pushFollow(FOLLOW_unreserved_keyword_in_cident4017);
                    k=unreserved_keyword();

                    state._fsp--;

                     id = new ColumnIdentifier(k, false); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return id;
    }
    // $ANTLR end "cident"


    // $ANTLR start "keyspaceName"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:705:1: keyspaceName returns [String id] : cfOrKsName[name, true] ;
    public final String keyspaceName() throws RecognitionException {
        String id = null;

         CFName name = new CFName(); 
        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:707:5: ( cfOrKsName[name, true] )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:707:7: cfOrKsName[name, true]
            {
            pushFollow(FOLLOW_cfOrKsName_in_keyspaceName4050);
            cfOrKsName(name, true);

            state._fsp--;

             id = name.getKeyspace(); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return id;
    }
    // $ANTLR end "keyspaceName"


    // $ANTLR start "columnFamilyName"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:710:1: columnFamilyName returns [CFName name] : ( cfOrKsName[name, true] '.' )? cfOrKsName[name, false] ;
    public final CFName columnFamilyName() throws RecognitionException {
        CFName name = null;

         name = new CFName(); 
        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:712:5: ( ( cfOrKsName[name, true] '.' )? cfOrKsName[name, false] )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:712:7: ( cfOrKsName[name, true] '.' )? cfOrKsName[name, false]
            {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:712:7: ( cfOrKsName[name, true] '.' )?
            int alt79=2;
            alt79 = dfa79.predict(input);
            switch (alt79) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:712:8: cfOrKsName[name, true] '.'
                    {
                    pushFollow(FOLLOW_cfOrKsName_in_columnFamilyName4084);
                    cfOrKsName(name, true);

                    state._fsp--;

                    match(input,139,FOLLOW_139_in_columnFamilyName4087); 

                    }
                    break;

            }

            pushFollow(FOLLOW_cfOrKsName_in_columnFamilyName4091);
            cfOrKsName(name, false);

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return name;
    }
    // $ANTLR end "columnFamilyName"


    // $ANTLR start "cfOrKsName"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:715:1: cfOrKsName[CFName name, boolean isKs] : (t= IDENT | t= QUOTED_NAME | k= unreserved_keyword );
    public final void cfOrKsName(CFName name, boolean isKs) throws RecognitionException {
        Token t=null;
        String k = null;


        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:716:5: (t= IDENT | t= QUOTED_NAME | k= unreserved_keyword )
            int alt80=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt80=1;
                }
                break;
            case QUOTED_NAME:
                {
                alt80=2;
                }
                break;
            case K_COUNT:
            case K_AS:
            case K_FILTERING:
            case K_WRITETIME:
            case K_TTL:
            case K_VALUES:
            case K_TIMESTAMP:
            case K_EXISTS:
            case K_COUNTER:
            case K_KEY:
            case K_COMPACT:
            case K_STORAGE:
            case K_CLUSTERING:
            case K_CUSTOM:
            case K_TRIGGER:
            case K_TYPE:
            case K_LIST:
            case K_ALL:
            case K_PERMISSIONS:
            case K_PERMISSION:
            case K_KEYSPACES:
            case K_USER:
            case K_SUPERUSER:
            case K_NOSUPERUSER:
            case K_USERS:
            case K_PASSWORD:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INET:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
            case K_MAP:
                {
                alt80=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:716:7: t= IDENT
                    {
                    t=(Token)match(input,IDENT,FOLLOW_IDENT_in_cfOrKsName4112); 
                     if (isKs) name.setKeyspace((t!=null?t.getText():null), false); else name.setColumnFamily((t!=null?t.getText():null), false); 

                    }
                    break;
                case 2 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:717:7: t= QUOTED_NAME
                    {
                    t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_cfOrKsName4137); 
                     if (isKs) name.setKeyspace((t!=null?t.getText():null), true); else name.setColumnFamily((t!=null?t.getText():null), true); 

                    }
                    break;
                case 3 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:718:7: k= unreserved_keyword
                    {
                    pushFollow(FOLLOW_unreserved_keyword_in_cfOrKsName4156);
                    k=unreserved_keyword();

                    state._fsp--;

                     if (isKs) name.setKeyspace(k, false); else name.setColumnFamily(k, false); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "cfOrKsName"


    // $ANTLR start "constant"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:721:1: constant returns [Constants.Literal constant] : (t= STRING_LITERAL | t= INTEGER | t= FLOAT | t= BOOLEAN | t= UUID | t= HEXNUMBER );
    public final Constants.Literal constant() throws RecognitionException {
        Constants.Literal constant = null;

        Token t=null;

        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:722:5: (t= STRING_LITERAL | t= INTEGER | t= FLOAT | t= BOOLEAN | t= UUID | t= HEXNUMBER )
            int alt81=6;
            switch ( input.LA(1) ) {
            case STRING_LITERAL:
                {
                alt81=1;
                }
                break;
            case INTEGER:
                {
                alt81=2;
                }
                break;
            case FLOAT:
                {
                alt81=3;
                }
                break;
            case BOOLEAN:
                {
                alt81=4;
                }
                break;
            case UUID:
                {
                alt81=5;
                }
                break;
            case HEXNUMBER:
                {
                alt81=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:722:7: t= STRING_LITERAL
                    {
                    t=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_constant4181); 
                     constant = Constants.Literal.string((t!=null?t.getText():null)); 

                    }
                    break;
                case 2 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:723:7: t= INTEGER
                    {
                    t=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_constant4193); 
                     constant = Constants.Literal.integer((t!=null?t.getText():null)); 

                    }
                    break;
                case 3 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:724:7: t= FLOAT
                    {
                    t=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_constant4212); 
                     constant = Constants.Literal.floatingPoint((t!=null?t.getText():null)); 

                    }
                    break;
                case 4 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:725:7: t= BOOLEAN
                    {
                    t=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_constant4233); 
                     constant = Constants.Literal.bool((t!=null?t.getText():null)); 

                    }
                    break;
                case 5 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:726:7: t= UUID
                    {
                    t=(Token)match(input,UUID,FOLLOW_UUID_in_constant4252); 
                     constant = Constants.Literal.uuid((t!=null?t.getText():null)); 

                    }
                    break;
                case 6 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:727:7: t= HEXNUMBER
                    {
                    t=(Token)match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_constant4274); 
                     constant = Constants.Literal.hex((t!=null?t.getText():null)); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return constant;
    }
    // $ANTLR end "constant"


    // $ANTLR start "set_tail"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:730:1: set_tail[List<Term.Raw> s] : ( '}' | ',' t= term set_tail[s] );
    public final void set_tail(List<Term.Raw> s) throws RecognitionException {
        Term.Raw t = null;


        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:731:5: ( '}' | ',' t= term set_tail[s] )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==140) ) {
                alt82=1;
            }
            else if ( (LA82_0==135) ) {
                alt82=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:731:7: '}'
                    {
                    match(input,140,FOLLOW_140_in_set_tail4299); 

                    }
                    break;
                case 2 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:732:7: ',' t= term set_tail[s]
                    {
                    match(input,135,FOLLOW_135_in_set_tail4307); 
                    pushFollow(FOLLOW_term_in_set_tail4311);
                    t=term();

                    state._fsp--;

                     s.add(t); 
                    pushFollow(FOLLOW_set_tail_in_set_tail4315);
                    set_tail(s);

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "set_tail"


    // $ANTLR start "map_tail"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:735:1: map_tail[List<Pair<Term.Raw, Term.Raw>> m] : ( '}' | ',' k= term ':' v= term map_tail[m] );
    public final void map_tail(List<Pair<Term.Raw, Term.Raw>> m) throws RecognitionException {
        Term.Raw k = null;

        Term.Raw v = null;


        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:736:5: ( '}' | ',' k= term ':' v= term map_tail[m] )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==140) ) {
                alt83=1;
            }
            else if ( (LA83_0==135) ) {
                alt83=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:736:7: '}'
                    {
                    match(input,140,FOLLOW_140_in_map_tail4334); 

                    }
                    break;
                case 2 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:737:7: ',' k= term ':' v= term map_tail[m]
                    {
                    match(input,135,FOLLOW_135_in_map_tail4342); 
                    pushFollow(FOLLOW_term_in_map_tail4346);
                    k=term();

                    state._fsp--;

                    match(input,141,FOLLOW_141_in_map_tail4348); 
                    pushFollow(FOLLOW_term_in_map_tail4352);
                    v=term();

                    state._fsp--;

                     m.add(Pair.create(k, v)); 
                    pushFollow(FOLLOW_map_tail_in_map_tail4356);
                    map_tail(m);

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "map_tail"


    // $ANTLR start "map_literal"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:740:1: map_literal returns [Maps.Literal map] : ( '{' '}' | '{' k1= term ':' v1= term map_tail[m] );
    public final Maps.Literal map_literal() throws RecognitionException {
        Maps.Literal map = null;

        Term.Raw k1 = null;

        Term.Raw v1 = null;


        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:741:5: ( '{' '}' | '{' k1= term ':' v1= term map_tail[m] )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==142) ) {
                int LA84_1 = input.LA(2);

                if ( (LA84_1==140) ) {
                    alt84=1;
                }
                else if ( (LA84_1==K_AS||LA84_1==K_FILTERING||LA84_1==INTEGER||LA84_1==K_VALUES||LA84_1==K_TIMESTAMP||LA84_1==K_EXISTS||LA84_1==K_COUNTER||(LA84_1>=K_KEY && LA84_1<=K_CUSTOM)||LA84_1==IDENT||(LA84_1>=STRING_LITERAL && LA84_1<=K_TRIGGER)||LA84_1==K_TYPE||LA84_1==K_LIST||(LA84_1>=K_ALL && LA84_1<=K_PASSWORD)||(LA84_1>=FLOAT && LA84_1<=K_TOKEN)||(LA84_1>=K_ASCII && LA84_1<=K_MAP)||LA84_1==133||LA84_1==137||LA84_1==142) ) {
                    alt84=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 84, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:741:7: '{' '}'
                    {
                    match(input,142,FOLLOW_142_in_map_literal4378); 
                    match(input,140,FOLLOW_140_in_map_literal4380); 
                     map = new Maps.Literal(Collections.<Pair<Term.Raw, Term.Raw>>emptyList()); 

                    }
                    break;
                case 2 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:742:7: '{' k1= term ':' v1= term map_tail[m]
                    {
                    match(input,142,FOLLOW_142_in_map_literal4390); 
                     List<Pair<Term.Raw, Term.Raw>> m = new ArrayList<Pair<Term.Raw, Term.Raw>>(); 
                    pushFollow(FOLLOW_term_in_map_literal4406);
                    k1=term();

                    state._fsp--;

                    match(input,141,FOLLOW_141_in_map_literal4408); 
                    pushFollow(FOLLOW_term_in_map_literal4412);
                    v1=term();

                    state._fsp--;

                     m.add(Pair.create(k1, v1)); 
                    pushFollow(FOLLOW_map_tail_in_map_literal4416);
                    map_tail(m);

                    state._fsp--;

                     map = new Maps.Literal(m); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return map;
    }
    // $ANTLR end "map_literal"


    // $ANTLR start "set_or_map"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:747:1: set_or_map[Term.Raw t] returns [Term.Raw value] : ( ':' v= term map_tail[m] | set_tail[s] );
    public final Term.Raw set_or_map(Term.Raw t) throws RecognitionException {
        Term.Raw value = null;

        Term.Raw v = null;


        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:748:5: ( ':' v= term map_tail[m] | set_tail[s] )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==141) ) {
                alt85=1;
            }
            else if ( (LA85_0==135||LA85_0==140) ) {
                alt85=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:748:7: ':' v= term map_tail[m]
                    {
                    match(input,141,FOLLOW_141_in_set_or_map4448); 
                    pushFollow(FOLLOW_term_in_set_or_map4452);
                    v=term();

                    state._fsp--;

                     List<Pair<Term.Raw, Term.Raw>> m = new ArrayList<Pair<Term.Raw, Term.Raw>>(); m.add(Pair.create(t, v)); 
                    pushFollow(FOLLOW_map_tail_in_set_or_map4456);
                    map_tail(m);

                    state._fsp--;

                     value = new Maps.Literal(m); 

                    }
                    break;
                case 2 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:749:7: set_tail[s]
                    {
                     List<Term.Raw> s = new ArrayList<Term.Raw>(); s.add(t); 
                    pushFollow(FOLLOW_set_tail_in_set_or_map4469);
                    set_tail(s);

                    state._fsp--;

                     value = new Sets.Literal(s); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "set_or_map"


    // $ANTLR start "collection_literal"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:753:1: collection_literal returns [Term.Raw value] : ( '[' (t1= term ( ',' tn= term )* )? ']' | '{' t= term v= set_or_map[t] | '{' '}' );
    public final Term.Raw collection_literal() throws RecognitionException {
        Term.Raw value = null;

        Term.Raw t1 = null;

        Term.Raw tn = null;

        Term.Raw t = null;

        Term.Raw v = null;


        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:754:5: ( '[' (t1= term ( ',' tn= term )* )? ']' | '{' t= term v= set_or_map[t] | '{' '}' )
            int alt88=3;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==137) ) {
                alt88=1;
            }
            else if ( (LA88_0==142) ) {
                int LA88_2 = input.LA(2);

                if ( (LA88_2==140) ) {
                    alt88=3;
                }
                else if ( (LA88_2==K_AS||LA88_2==K_FILTERING||LA88_2==INTEGER||LA88_2==K_VALUES||LA88_2==K_TIMESTAMP||LA88_2==K_EXISTS||LA88_2==K_COUNTER||(LA88_2>=K_KEY && LA88_2<=K_CUSTOM)||LA88_2==IDENT||(LA88_2>=STRING_LITERAL && LA88_2<=K_TRIGGER)||LA88_2==K_TYPE||LA88_2==K_LIST||(LA88_2>=K_ALL && LA88_2<=K_PASSWORD)||(LA88_2>=FLOAT && LA88_2<=K_TOKEN)||(LA88_2>=K_ASCII && LA88_2<=K_MAP)||LA88_2==133||LA88_2==137||LA88_2==142) ) {
                    alt88=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 88, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:754:7: '[' (t1= term ( ',' tn= term )* )? ']'
                    {
                    match(input,137,FOLLOW_137_in_collection_literal4494); 
                     List<Term.Raw> l = new ArrayList<Term.Raw>(); 
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:754:61: (t1= term ( ',' tn= term )* )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==K_AS||LA87_0==K_FILTERING||LA87_0==INTEGER||LA87_0==K_VALUES||LA87_0==K_TIMESTAMP||LA87_0==K_EXISTS||LA87_0==K_COUNTER||(LA87_0>=K_KEY && LA87_0<=K_CUSTOM)||LA87_0==IDENT||(LA87_0>=STRING_LITERAL && LA87_0<=K_TRIGGER)||LA87_0==K_TYPE||LA87_0==K_LIST||(LA87_0>=K_ALL && LA87_0<=K_PASSWORD)||(LA87_0>=FLOAT && LA87_0<=K_TOKEN)||(LA87_0>=K_ASCII && LA87_0<=K_MAP)||LA87_0==133||LA87_0==137||LA87_0==142) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:754:63: t1= term ( ',' tn= term )*
                            {
                            pushFollow(FOLLOW_term_in_collection_literal4502);
                            t1=term();

                            state._fsp--;

                             l.add(t1); 
                            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:754:86: ( ',' tn= term )*
                            loop86:
                            do {
                                int alt86=2;
                                int LA86_0 = input.LA(1);

                                if ( (LA86_0==135) ) {
                                    alt86=1;
                                }


                                switch (alt86) {
                            	case 1 :
                            	    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:754:88: ',' tn= term
                            	    {
                            	    match(input,135,FOLLOW_135_in_collection_literal4508); 
                            	    pushFollow(FOLLOW_term_in_collection_literal4512);
                            	    tn=term();

                            	    state._fsp--;

                            	     l.add(tn); 

                            	    }
                            	    break;

                            	default :
                            	    break loop86;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,138,FOLLOW_138_in_collection_literal4522); 
                     value = new Lists.Literal(l); 

                    }
                    break;
                case 2 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:755:7: '{' t= term v= set_or_map[t]
                    {
                    match(input,142,FOLLOW_142_in_collection_literal4532); 
                    pushFollow(FOLLOW_term_in_collection_literal4536);
                    t=term();

                    state._fsp--;

                    pushFollow(FOLLOW_set_or_map_in_collection_literal4540);
                    v=set_or_map(t);

                    state._fsp--;

                     value = v; 

                    }
                    break;
                case 3 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:757:7: '{' '}'
                    {
                    match(input,142,FOLLOW_142_in_collection_literal4556); 
                    match(input,140,FOLLOW_140_in_collection_literal4558); 
                     value = new Sets.Literal(Collections.<Term.Raw>emptyList()); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "collection_literal"


    // $ANTLR start "value"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:760:1: value returns [Term.Raw value] : (c= constant | l= collection_literal | K_NULL | QMARK );
    public final Term.Raw value() throws RecognitionException {
        Term.Raw value = null;

        Constants.Literal c = null;

        Term.Raw l = null;


        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:761:5: (c= constant | l= collection_literal | K_NULL | QMARK )
            int alt89=4;
            switch ( input.LA(1) ) {
            case INTEGER:
            case STRING_LITERAL:
            case FLOAT:
            case BOOLEAN:
            case UUID:
            case HEXNUMBER:
                {
                alt89=1;
                }
                break;
            case 137:
            case 142:
                {
                alt89=2;
                }
                break;
            case K_NULL:
                {
                alt89=3;
                }
                break;
            case QMARK:
                {
                alt89=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:761:7: c= constant
                    {
                    pushFollow(FOLLOW_constant_in_value4583);
                    c=constant();

                    state._fsp--;

                     value = c; 

                    }
                    break;
                case 2 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:762:7: l= collection_literal
                    {
                    pushFollow(FOLLOW_collection_literal_in_value4605);
                    l=collection_literal();

                    state._fsp--;

                     value = l; 

                    }
                    break;
                case 3 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:763:7: K_NULL
                    {
                    match(input,K_NULL,FOLLOW_K_NULL_in_value4615); 
                     value = Constants.NULL_LITERAL; 

                    }
                    break;
                case 4 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:764:7: QMARK
                    {
                    match(input,QMARK,FOLLOW_QMARK_in_value4639); 
                     value = new AbstractMarker.Raw(++currentBindMarkerIdx); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "value"


    // $ANTLR start "intValue"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:767:1: intValue returns [Term.Raw value] : ( | t= INTEGER | QMARK );
    public final Term.Raw intValue() throws RecognitionException {
        Term.Raw value = null;

        Token t=null;

        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:768:5: ( | t= INTEGER | QMARK )
            int alt90=3;
            switch ( input.LA(1) ) {
            case EOF:
            case K_WHERE:
            case K_ALLOW:
            case K_TTL:
            case K_AND:
            case K_INSERT:
            case K_TIMESTAMP:
            case K_UPDATE:
            case K_SET:
            case K_DELETE:
            case K_APPLY:
            case 132:
                {
                alt90=1;
                }
                break;
            case INTEGER:
                {
                alt90=2;
                }
                break;
            case QMARK:
                {
                alt90=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:769:5: 
                    {
                    }
                    break;
                case 2 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:769:7: t= INTEGER
                    {
                    t=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_intValue4685); 
                     value = Constants.Literal.integer((t!=null?t.getText():null)); 

                    }
                    break;
                case 3 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:770:7: QMARK
                    {
                    match(input,QMARK,FOLLOW_QMARK_in_intValue4695); 
                     value = new AbstractMarker.Raw(++currentBindMarkerIdx); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "intValue"


    // $ANTLR start "functionName"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:773:1: functionName returns [String s] : (f= IDENT | u= unreserved_function_keyword | K_TOKEN );
    public final String functionName() throws RecognitionException {
        String s = null;

        Token f=null;
        String u = null;


        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:774:5: (f= IDENT | u= unreserved_function_keyword | K_TOKEN )
            int alt91=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt91=1;
                }
                break;
            case K_AS:
            case K_FILTERING:
            case K_VALUES:
            case K_TIMESTAMP:
            case K_EXISTS:
            case K_COUNTER:
            case K_KEY:
            case K_COMPACT:
            case K_STORAGE:
            case K_CLUSTERING:
            case K_CUSTOM:
            case K_TRIGGER:
            case K_TYPE:
            case K_LIST:
            case K_ALL:
            case K_PERMISSIONS:
            case K_PERMISSION:
            case K_KEYSPACES:
            case K_USER:
            case K_SUPERUSER:
            case K_NOSUPERUSER:
            case K_USERS:
            case K_PASSWORD:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INET:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
            case K_MAP:
                {
                alt91=2;
                }
                break;
            case K_TOKEN:
                {
                alt91=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:774:7: f= IDENT
                    {
                    f=(Token)match(input,IDENT,FOLLOW_IDENT_in_functionName4724); 
                     s = (f!=null?f.getText():null); 

                    }
                    break;
                case 2 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:775:7: u= unreserved_function_keyword
                    {
                    pushFollow(FOLLOW_unreserved_function_keyword_in_functionName4758);
                    u=unreserved_function_keyword();

                    state._fsp--;

                     s = u; 

                    }
                    break;
                case 3 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:776:7: K_TOKEN
                    {
                    match(input,K_TOKEN,FOLLOW_K_TOKEN_in_functionName4768); 
                     s = "token"; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return s;
    }
    // $ANTLR end "functionName"


    // $ANTLR start "functionArgs"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:779:1: functionArgs returns [List<Term.Raw> a] : ( '(' ')' | '(' t1= term ( ',' tn= term )* ')' );
    public final List<Term.Raw> functionArgs() throws RecognitionException {
        List<Term.Raw> a = null;

        Term.Raw t1 = null;

        Term.Raw tn = null;


        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:780:5: ( '(' ')' | '(' t1= term ( ',' tn= term )* ')' )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==133) ) {
                int LA93_1 = input.LA(2);

                if ( (LA93_1==134) ) {
                    alt93=1;
                }
                else if ( (LA93_1==K_AS||LA93_1==K_FILTERING||LA93_1==INTEGER||LA93_1==K_VALUES||LA93_1==K_TIMESTAMP||LA93_1==K_EXISTS||LA93_1==K_COUNTER||(LA93_1>=K_KEY && LA93_1<=K_CUSTOM)||LA93_1==IDENT||(LA93_1>=STRING_LITERAL && LA93_1<=K_TRIGGER)||LA93_1==K_TYPE||LA93_1==K_LIST||(LA93_1>=K_ALL && LA93_1<=K_PASSWORD)||(LA93_1>=FLOAT && LA93_1<=K_TOKEN)||(LA93_1>=K_ASCII && LA93_1<=K_MAP)||LA93_1==133||LA93_1==137||LA93_1==142) ) {
                    alt93=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }
            switch (alt93) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:780:7: '(' ')'
                    {
                    match(input,133,FOLLOW_133_in_functionArgs4813); 
                    match(input,134,FOLLOW_134_in_functionArgs4815); 
                     a = Collections.emptyList(); 

                    }
                    break;
                case 2 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:781:7: '(' t1= term ( ',' tn= term )* ')'
                    {
                    match(input,133,FOLLOW_133_in_functionArgs4825); 
                    pushFollow(FOLLOW_term_in_functionArgs4829);
                    t1=term();

                    state._fsp--;

                     List<Term.Raw> args = new ArrayList<Term.Raw>(); args.add(t1); 
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:782:11: ( ',' tn= term )*
                    loop92:
                    do {
                        int alt92=2;
                        int LA92_0 = input.LA(1);

                        if ( (LA92_0==135) ) {
                            alt92=1;
                        }


                        switch (alt92) {
                    	case 1 :
                    	    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:782:13: ',' tn= term
                    	    {
                    	    match(input,135,FOLLOW_135_in_functionArgs4845); 
                    	    pushFollow(FOLLOW_term_in_functionArgs4849);
                    	    tn=term();

                    	    state._fsp--;

                    	     args.add(tn); 

                    	    }
                    	    break;

                    	default :
                    	    break loop92;
                        }
                    } while (true);

                    match(input,134,FOLLOW_134_in_functionArgs4863); 
                     a = args; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return a;
    }
    // $ANTLR end "functionArgs"


    // $ANTLR start "term"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:786:1: term returns [Term.Raw term] : (v= value | f= functionName args= functionArgs | '(' c= comparatorType ')' t= term );
    public final Term.Raw term() throws RecognitionException {
        Term.Raw term = null;

        Term.Raw v = null;

        String f = null;

        List<Term.Raw> args = null;

        CQL3Type c = null;

        Term.Raw t = null;


        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:787:5: (v= value | f= functionName args= functionArgs | '(' c= comparatorType ')' t= term )
            int alt94=3;
            switch ( input.LA(1) ) {
            case INTEGER:
            case STRING_LITERAL:
            case FLOAT:
            case BOOLEAN:
            case UUID:
            case HEXNUMBER:
            case K_NULL:
            case QMARK:
            case 137:
            case 142:
                {
                alt94=1;
                }
                break;
            case K_AS:
            case K_FILTERING:
            case K_VALUES:
            case K_TIMESTAMP:
            case K_EXISTS:
            case K_COUNTER:
            case K_KEY:
            case K_COMPACT:
            case K_STORAGE:
            case K_CLUSTERING:
            case K_CUSTOM:
            case IDENT:
            case K_TRIGGER:
            case K_TYPE:
            case K_LIST:
            case K_ALL:
            case K_PERMISSIONS:
            case K_PERMISSION:
            case K_KEYSPACES:
            case K_USER:
            case K_SUPERUSER:
            case K_NOSUPERUSER:
            case K_USERS:
            case K_PASSWORD:
            case K_TOKEN:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INET:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
            case K_MAP:
                {
                alt94=2;
                }
                break;
            case 133:
                {
                alt94=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }

            switch (alt94) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:787:7: v= value
                    {
                    pushFollow(FOLLOW_value_in_term4888);
                    v=value();

                    state._fsp--;

                     term = v; 

                    }
                    break;
                case 2 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:788:7: f= functionName args= functionArgs
                    {
                    pushFollow(FOLLOW_functionName_in_term4925);
                    f=functionName();

                    state._fsp--;

                    pushFollow(FOLLOW_functionArgs_in_term4929);
                    args=functionArgs();

                    state._fsp--;

                     term = new FunctionCall.Raw(f, args); 

                    }
                    break;
                case 3 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:789:7: '(' c= comparatorType ')' t= term
                    {
                    match(input,133,FOLLOW_133_in_term4939); 
                    pushFollow(FOLLOW_comparatorType_in_term4943);
                    c=comparatorType();

                    state._fsp--;

                    match(input,134,FOLLOW_134_in_term4945); 
                    pushFollow(FOLLOW_term_in_term4949);
                    t=term();

                    state._fsp--;

                     term = new TypeCast(c, t); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return term;
    }
    // $ANTLR end "term"


    // $ANTLR start "columnOperation"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:792:1: columnOperation[List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations] : (key= cident '=' t= term ( '+' c= cident )? | key= cident '=' c= cident sig= ( '+' | '-' ) t= term | key= cident '=' c= cident i= INTEGER | key= cident '[' k= term ']' '=' t= term );
    public final void columnOperation(List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations) throws RecognitionException {
        Token sig=null;
        Token i=null;
        ColumnIdentifier key = null;

        Term.Raw t = null;

        ColumnIdentifier c = null;

        Term.Raw k = null;


        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:793:5: (key= cident '=' t= term ( '+' c= cident )? | key= cident '=' c= cident sig= ( '+' | '-' ) t= term | key= cident '=' c= cident i= INTEGER | key= cident '[' k= term ']' '=' t= term )
            int alt96=4;
            alt96 = dfa96.predict(input);
            switch (alt96) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:793:7: key= cident '=' t= term ( '+' c= cident )?
                    {
                    pushFollow(FOLLOW_cident_in_columnOperation4972);
                    key=cident();

                    state._fsp--;

                    match(input,143,FOLLOW_143_in_columnOperation4974); 
                    pushFollow(FOLLOW_term_in_columnOperation4978);
                    t=term();

                    state._fsp--;

                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:793:29: ( '+' c= cident )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==144) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:793:30: '+' c= cident
                            {
                            match(input,144,FOLLOW_144_in_columnOperation4981); 
                            pushFollow(FOLLOW_cident_in_columnOperation4985);
                            c=cident();

                            state._fsp--;


                            }
                            break;

                    }


                              if (c == null)
                              {
                                  addRawUpdate(operations, key, new Operation.SetValue(t));
                              }
                              else
                              {
                                  if (!key.equals(c))
                                      addRecognitionError("Only expressions of the form X = <value> + X are supported.");
                                  addRawUpdate(operations, key, new Operation.Prepend(t));
                              }
                          

                    }
                    break;
                case 2 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:806:7: key= cident '=' c= cident sig= ( '+' | '-' ) t= term
                    {
                    pushFollow(FOLLOW_cident_in_columnOperation5006);
                    key=cident();

                    state._fsp--;

                    match(input,143,FOLLOW_143_in_columnOperation5008); 
                    pushFollow(FOLLOW_cident_in_columnOperation5012);
                    c=cident();

                    state._fsp--;

                    sig=(Token)input.LT(1);
                    if ( (input.LA(1)>=144 && input.LA(1)<=145) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_term_in_columnOperation5026);
                    t=term();

                    state._fsp--;


                              if (!key.equals(c))
                                  addRecognitionError("Only expressions of the form X = X " + (sig!=null?sig.getText():null) + "<value> are supported.");
                              addRawUpdate(operations, key, (sig!=null?sig.getText():null).equals("+") ? new Operation.Addition(t) : new Operation.Substraction(t));
                          

                    }
                    break;
                case 3 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:812:7: key= cident '=' c= cident i= INTEGER
                    {
                    pushFollow(FOLLOW_cident_in_columnOperation5044);
                    key=cident();

                    state._fsp--;

                    match(input,143,FOLLOW_143_in_columnOperation5046); 
                    pushFollow(FOLLOW_cident_in_columnOperation5050);
                    c=cident();

                    state._fsp--;

                    i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_columnOperation5054); 

                              // Note that this production *is* necessary because X = X - 3 will in fact be lexed as [ X, '=', X, INTEGER].
                              if (!key.equals(c))
                                  // We don't yet allow a '+' in front of an integer, but we could in the future really, so let's be future-proof in our error message
                                  addRecognitionError("Only expressions of the form X = X " + ((i!=null?i.getText():null).charAt(0) == '-' ? '-' : '+') + " <value> are supported.");
                              addRawUpdate(operations, key, new Operation.Addition(Constants.Literal.integer((i!=null?i.getText():null))));
                          

                    }
                    break;
                case 4 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:820:7: key= cident '[' k= term ']' '=' t= term
                    {
                    pushFollow(FOLLOW_cident_in_columnOperation5072);
                    key=cident();

                    state._fsp--;

                    match(input,137,FOLLOW_137_in_columnOperation5074); 
                    pushFollow(FOLLOW_term_in_columnOperation5078);
                    k=term();

                    state._fsp--;

                    match(input,138,FOLLOW_138_in_columnOperation5080); 
                    match(input,143,FOLLOW_143_in_columnOperation5082); 
                    pushFollow(FOLLOW_term_in_columnOperation5086);
                    t=term();

                    state._fsp--;


                              addRawUpdate(operations, key, new Operation.SetElement(k, t));
                          

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "columnOperation"


    // $ANTLR start "properties"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:826:1: properties[PropertyDefinitions props] : property[props] ( K_AND property[props] )* ;
    public final void properties(PropertyDefinitions props) throws RecognitionException {
        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:827:5: ( property[props] ( K_AND property[props] )* )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:827:7: property[props] ( K_AND property[props] )*
            {
            pushFollow(FOLLOW_property_in_properties5112);
            property(props);

            state._fsp--;

            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:827:23: ( K_AND property[props] )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==K_AND) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:827:24: K_AND property[props]
            	    {
            	    match(input,K_AND,FOLLOW_K_AND_in_properties5116); 
            	    pushFollow(FOLLOW_property_in_properties5118);
            	    property(props);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop97;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "properties"


    // $ANTLR start "property"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:830:1: property[PropertyDefinitions props] : k= cident '=' (simple= propertyValue | map= map_literal ) ;
    public final void property(PropertyDefinitions props) throws RecognitionException {
        ColumnIdentifier k = null;

        String simple = null;

        Maps.Literal map = null;


        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:831:5: (k= cident '=' (simple= propertyValue | map= map_literal ) )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:831:7: k= cident '=' (simple= propertyValue | map= map_literal )
            {
            pushFollow(FOLLOW_cident_in_property5141);
            k=cident();

            state._fsp--;

            match(input,143,FOLLOW_143_in_property5143); 
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:831:20: (simple= propertyValue | map= map_literal )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( ((LA98_0>=K_COUNT && LA98_0<=K_AS)||(LA98_0>=K_FILTERING && LA98_0<=INTEGER)||LA98_0==K_VALUES||LA98_0==K_TIMESTAMP||LA98_0==K_EXISTS||LA98_0==K_COUNTER||(LA98_0>=K_KEY && LA98_0<=K_CUSTOM)||(LA98_0>=STRING_LITERAL && LA98_0<=K_TRIGGER)||LA98_0==K_TYPE||LA98_0==K_LIST||(LA98_0>=K_ALL && LA98_0<=K_PASSWORD)||(LA98_0>=FLOAT && LA98_0<=HEXNUMBER)||(LA98_0>=K_ASCII && LA98_0<=K_MAP)) ) {
                alt98=1;
            }
            else if ( (LA98_0==142) ) {
                alt98=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }
            switch (alt98) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:831:21: simple= propertyValue
                    {
                    pushFollow(FOLLOW_propertyValue_in_property5148);
                    simple=propertyValue();

                    state._fsp--;

                     try { props.addProperty(k.toString(), simple); } catch (SyntaxException e) { addRecognitionError(e.getMessage()); } 

                    }
                    break;
                case 2 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:832:24: map= map_literal
                    {
                    pushFollow(FOLLOW_map_literal_in_property5177);
                    map=map_literal();

                    state._fsp--;

                     try { props.addProperty(k.toString(), convertPropertyMap(map)); } catch (SyntaxException e) { addRecognitionError(e.getMessage()); } 

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "property"


    // $ANTLR start "propertyValue"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:835:1: propertyValue returns [String str] : (c= constant | u= unreserved_keyword );
    public final String propertyValue() throws RecognitionException {
        String str = null;

        Constants.Literal c = null;

        String u = null;


        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:836:5: (c= constant | u= unreserved_keyword )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==INTEGER||LA99_0==STRING_LITERAL||(LA99_0>=FLOAT && LA99_0<=HEXNUMBER)) ) {
                alt99=1;
            }
            else if ( ((LA99_0>=K_COUNT && LA99_0<=K_AS)||(LA99_0>=K_FILTERING && LA99_0<=K_TTL)||LA99_0==K_VALUES||LA99_0==K_TIMESTAMP||LA99_0==K_EXISTS||LA99_0==K_COUNTER||(LA99_0>=K_KEY && LA99_0<=K_CUSTOM)||LA99_0==K_TRIGGER||LA99_0==K_TYPE||LA99_0==K_LIST||(LA99_0>=K_ALL && LA99_0<=K_PASSWORD)||(LA99_0>=K_ASCII && LA99_0<=K_MAP)) ) {
                alt99=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }
            switch (alt99) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:836:7: c= constant
                    {
                    pushFollow(FOLLOW_constant_in_propertyValue5205);
                    c=constant();

                    state._fsp--;

                     str = c.getRawText(); 

                    }
                    break;
                case 2 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:837:7: u= unreserved_keyword
                    {
                    pushFollow(FOLLOW_unreserved_keyword_in_propertyValue5227);
                    u=unreserved_keyword();

                    state._fsp--;

                     str = u; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return str;
    }
    // $ANTLR end "propertyValue"


    // $ANTLR start "relationType"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:840:1: relationType returns [Relation.Type op] : ( '=' | '<' | '<=' | '>' | '>=' );
    public final Relation.Type relationType() throws RecognitionException {
        Relation.Type op = null;

        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:841:5: ( '=' | '<' | '<=' | '>' | '>=' )
            int alt100=5;
            switch ( input.LA(1) ) {
            case 143:
                {
                alt100=1;
                }
                break;
            case 146:
                {
                alt100=2;
                }
                break;
            case 147:
                {
                alt100=3;
                }
                break;
            case 148:
                {
                alt100=4;
                }
                break;
            case 149:
                {
                alt100=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }

            switch (alt100) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:841:7: '='
                    {
                    match(input,143,FOLLOW_143_in_relationType5250); 
                     op = Relation.Type.EQ; 

                    }
                    break;
                case 2 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:842:7: '<'
                    {
                    match(input,146,FOLLOW_146_in_relationType5261); 
                     op = Relation.Type.LT; 

                    }
                    break;
                case 3 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:843:7: '<='
                    {
                    match(input,147,FOLLOW_147_in_relationType5272); 
                     op = Relation.Type.LTE; 

                    }
                    break;
                case 4 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:844:7: '>'
                    {
                    match(input,148,FOLLOW_148_in_relationType5282); 
                     op = Relation.Type.GT; 

                    }
                    break;
                case 5 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:845:7: '>='
                    {
                    match(input,149,FOLLOW_149_in_relationType5293); 
                     op = Relation.Type.GTE; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return op;
    }
    // $ANTLR end "relationType"


    // $ANTLR start "relation"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:848:1: relation[List<Relation> clauses] : (name= cident type= relationType t= term | K_TOKEN '(' name1= cident ( ',' namen= cident )* ')' type= relationType t= term | name= cident K_IN '(' f1= term ( ',' fN= term )* ')' );
    public final void relation(List<Relation> clauses) throws RecognitionException {
        ColumnIdentifier name = null;

        Relation.Type type = null;

        Term.Raw t = null;

        ColumnIdentifier name1 = null;

        ColumnIdentifier namen = null;

        Term.Raw f1 = null;

        Term.Raw fN = null;


        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:849:5: (name= cident type= relationType t= term | K_TOKEN '(' name1= cident ( ',' namen= cident )* ')' type= relationType t= term | name= cident K_IN '(' f1= term ( ',' fN= term )* ')' )
            int alt103=3;
            alt103 = dfa103.predict(input);
            switch (alt103) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:849:7: name= cident type= relationType t= term
                    {
                    pushFollow(FOLLOW_cident_in_relation5315);
                    name=cident();

                    state._fsp--;

                    pushFollow(FOLLOW_relationType_in_relation5319);
                    type=relationType();

                    state._fsp--;

                    pushFollow(FOLLOW_term_in_relation5323);
                    t=term();

                    state._fsp--;

                     clauses.add(new Relation(name, type, t)); 

                    }
                    break;
                case 2 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:850:7: K_TOKEN '(' name1= cident ( ',' namen= cident )* ')' type= relationType t= term
                    {
                    match(input,K_TOKEN,FOLLOW_K_TOKEN_in_relation5333); 
                     List<ColumnIdentifier> l = new ArrayList<ColumnIdentifier>(); 
                    match(input,133,FOLLOW_133_in_relation5356); 
                    pushFollow(FOLLOW_cident_in_relation5360);
                    name1=cident();

                    state._fsp--;

                     l.add(name1); 
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:852:46: ( ',' namen= cident )*
                    loop101:
                    do {
                        int alt101=2;
                        int LA101_0 = input.LA(1);

                        if ( (LA101_0==135) ) {
                            alt101=1;
                        }


                        switch (alt101) {
                    	case 1 :
                    	    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:852:48: ',' namen= cident
                    	    {
                    	    match(input,135,FOLLOW_135_in_relation5366); 
                    	    pushFollow(FOLLOW_cident_in_relation5370);
                    	    namen=cident();

                    	    state._fsp--;

                    	     l.add(namen); 

                    	    }
                    	    break;

                    	default :
                    	    break loop101;
                        }
                    } while (true);

                    match(input,134,FOLLOW_134_in_relation5376); 
                    pushFollow(FOLLOW_relationType_in_relation5388);
                    type=relationType();

                    state._fsp--;

                    pushFollow(FOLLOW_term_in_relation5392);
                    t=term();

                    state._fsp--;


                                for (ColumnIdentifier id : l)
                                    clauses.add(new Relation(id, type, t, true));
                            

                    }
                    break;
                case 3 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:858:7: name= cident K_IN '(' f1= term ( ',' fN= term )* ')'
                    {
                    pushFollow(FOLLOW_cident_in_relation5412);
                    name=cident();

                    state._fsp--;

                    match(input,K_IN,FOLLOW_K_IN_in_relation5414); 
                     Relation rel = Relation.createInRelation(name); 
                    match(input,133,FOLLOW_133_in_relation5425); 
                    pushFollow(FOLLOW_term_in_relation5429);
                    f1=term();

                    state._fsp--;

                     rel.addInValue(f1); 
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:859:44: ( ',' fN= term )*
                    loop102:
                    do {
                        int alt102=2;
                        int LA102_0 = input.LA(1);

                        if ( (LA102_0==135) ) {
                            alt102=1;
                        }


                        switch (alt102) {
                    	case 1 :
                    	    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:859:45: ',' fN= term
                    	    {
                    	    match(input,135,FOLLOW_135_in_relation5434); 
                    	    pushFollow(FOLLOW_term_in_relation5438);
                    	    fN=term();

                    	    state._fsp--;

                    	     rel.addInValue(fN); 

                    	    }
                    	    break;

                    	default :
                    	    break loop102;
                        }
                    } while (true);

                    match(input,134,FOLLOW_134_in_relation5445); 
                     clauses.add(rel); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "relation"


    // $ANTLR start "comparatorType"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:862:1: comparatorType returns [CQL3Type t] : (c= native_type | c= collection_type | s= STRING_LITERAL );
    public final CQL3Type comparatorType() throws RecognitionException {
        CQL3Type t = null;

        Token s=null;
        CQL3Type c = null;


        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:863:5: (c= native_type | c= collection_type | s= STRING_LITERAL )
            int alt104=3;
            switch ( input.LA(1) ) {
            case K_TIMESTAMP:
            case K_COUNTER:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INET:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
                {
                alt104=1;
                }
                break;
            case K_SET:
            case K_LIST:
            case K_MAP:
                {
                alt104=2;
                }
                break;
            case STRING_LITERAL:
                {
                alt104=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }

            switch (alt104) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:863:7: c= native_type
                    {
                    pushFollow(FOLLOW_native_type_in_comparatorType5470);
                    c=native_type();

                    state._fsp--;

                     t = c; 

                    }
                    break;
                case 2 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:864:7: c= collection_type
                    {
                    pushFollow(FOLLOW_collection_type_in_comparatorType5486);
                    c=collection_type();

                    state._fsp--;

                     t = c; 

                    }
                    break;
                case 3 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:865:7: s= STRING_LITERAL
                    {
                    s=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_comparatorType5498); 

                            try {
                                t = new CQL3Type.Custom((s!=null?s.getText():null));
                            } catch (SyntaxException e) {
                                addRecognitionError("Cannot parse type " + (s!=null?s.getText():null) + ": " + e.getMessage());
                            } catch (ConfigurationException e) {
                                addRecognitionError("Error setting type " + (s!=null?s.getText():null) + ": " + e.getMessage());
                            }
                          

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return t;
    }
    // $ANTLR end "comparatorType"


    // $ANTLR start "native_type"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:877:1: native_type returns [CQL3Type t] : ( K_ASCII | K_BIGINT | K_BLOB | K_BOOLEAN | K_COUNTER | K_DECIMAL | K_DOUBLE | K_FLOAT | K_INET | K_INT | K_TEXT | K_TIMESTAMP | K_UUID | K_VARCHAR | K_VARINT | K_TIMEUUID );
    public final CQL3Type native_type() throws RecognitionException {
        CQL3Type t = null;

        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:878:5: ( K_ASCII | K_BIGINT | K_BLOB | K_BOOLEAN | K_COUNTER | K_DECIMAL | K_DOUBLE | K_FLOAT | K_INET | K_INT | K_TEXT | K_TIMESTAMP | K_UUID | K_VARCHAR | K_VARINT | K_TIMEUUID )
            int alt105=16;
            switch ( input.LA(1) ) {
            case K_ASCII:
                {
                alt105=1;
                }
                break;
            case K_BIGINT:
                {
                alt105=2;
                }
                break;
            case K_BLOB:
                {
                alt105=3;
                }
                break;
            case K_BOOLEAN:
                {
                alt105=4;
                }
                break;
            case K_COUNTER:
                {
                alt105=5;
                }
                break;
            case K_DECIMAL:
                {
                alt105=6;
                }
                break;
            case K_DOUBLE:
                {
                alt105=7;
                }
                break;
            case K_FLOAT:
                {
                alt105=8;
                }
                break;
            case K_INET:
                {
                alt105=9;
                }
                break;
            case K_INT:
                {
                alt105=10;
                }
                break;
            case K_TEXT:
                {
                alt105=11;
                }
                break;
            case K_TIMESTAMP:
                {
                alt105=12;
                }
                break;
            case K_UUID:
                {
                alt105=13;
                }
                break;
            case K_VARCHAR:
                {
                alt105=14;
                }
                break;
            case K_VARINT:
                {
                alt105=15;
                }
                break;
            case K_TIMEUUID:
                {
                alt105=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }

            switch (alt105) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:878:7: K_ASCII
                    {
                    match(input,K_ASCII,FOLLOW_K_ASCII_in_native_type5527); 
                     t = CQL3Type.Native.ASCII; 

                    }
                    break;
                case 2 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:879:7: K_BIGINT
                    {
                    match(input,K_BIGINT,FOLLOW_K_BIGINT_in_native_type5541); 
                     t = CQL3Type.Native.BIGINT; 

                    }
                    break;
                case 3 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:880:7: K_BLOB
                    {
                    match(input,K_BLOB,FOLLOW_K_BLOB_in_native_type5554); 
                     t = CQL3Type.Native.BLOB; 

                    }
                    break;
                case 4 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:881:7: K_BOOLEAN
                    {
                    match(input,K_BOOLEAN,FOLLOW_K_BOOLEAN_in_native_type5569); 
                     t = CQL3Type.Native.BOOLEAN; 

                    }
                    break;
                case 5 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:882:7: K_COUNTER
                    {
                    match(input,K_COUNTER,FOLLOW_K_COUNTER_in_native_type5581); 
                     t = CQL3Type.Native.COUNTER; 

                    }
                    break;
                case 6 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:883:7: K_DECIMAL
                    {
                    match(input,K_DECIMAL,FOLLOW_K_DECIMAL_in_native_type5593); 
                     t = CQL3Type.Native.DECIMAL; 

                    }
                    break;
                case 7 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:884:7: K_DOUBLE
                    {
                    match(input,K_DOUBLE,FOLLOW_K_DOUBLE_in_native_type5605); 
                     t = CQL3Type.Native.DOUBLE; 

                    }
                    break;
                case 8 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:885:7: K_FLOAT
                    {
                    match(input,K_FLOAT,FOLLOW_K_FLOAT_in_native_type5618); 
                     t = CQL3Type.Native.FLOAT; 

                    }
                    break;
                case 9 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:886:7: K_INET
                    {
                    match(input,K_INET,FOLLOW_K_INET_in_native_type5632); 
                     t = CQL3Type.Native.INET;

                    }
                    break;
                case 10 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:887:7: K_INT
                    {
                    match(input,K_INT,FOLLOW_K_INT_in_native_type5647); 
                     t = CQL3Type.Native.INT; 

                    }
                    break;
                case 11 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:888:7: K_TEXT
                    {
                    match(input,K_TEXT,FOLLOW_K_TEXT_in_native_type5663); 
                     t = CQL3Type.Native.TEXT; 

                    }
                    break;
                case 12 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:889:7: K_TIMESTAMP
                    {
                    match(input,K_TIMESTAMP,FOLLOW_K_TIMESTAMP_in_native_type5678); 
                     t = CQL3Type.Native.TIMESTAMP; 

                    }
                    break;
                case 13 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:890:7: K_UUID
                    {
                    match(input,K_UUID,FOLLOW_K_UUID_in_native_type5688); 
                     t = CQL3Type.Native.UUID; 

                    }
                    break;
                case 14 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:891:7: K_VARCHAR
                    {
                    match(input,K_VARCHAR,FOLLOW_K_VARCHAR_in_native_type5703); 
                     t = CQL3Type.Native.VARCHAR; 

                    }
                    break;
                case 15 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:892:7: K_VARINT
                    {
                    match(input,K_VARINT,FOLLOW_K_VARINT_in_native_type5715); 
                     t = CQL3Type.Native.VARINT; 

                    }
                    break;
                case 16 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:893:7: K_TIMEUUID
                    {
                    match(input,K_TIMEUUID,FOLLOW_K_TIMEUUID_in_native_type5728); 
                     t = CQL3Type.Native.TIMEUUID; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return t;
    }
    // $ANTLR end "native_type"


    // $ANTLR start "collection_type"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:896:1: collection_type returns [CQL3Type pt] : ( K_MAP '<' t1= comparatorType ',' t2= comparatorType '>' | K_LIST '<' t= comparatorType '>' | K_SET '<' t= comparatorType '>' );
    public final CQL3Type collection_type() throws RecognitionException {
        CQL3Type pt = null;

        CQL3Type t1 = null;

        CQL3Type t2 = null;

        CQL3Type t = null;


        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:897:5: ( K_MAP '<' t1= comparatorType ',' t2= comparatorType '>' | K_LIST '<' t= comparatorType '>' | K_SET '<' t= comparatorType '>' )
            int alt106=3;
            switch ( input.LA(1) ) {
            case K_MAP:
                {
                alt106=1;
                }
                break;
            case K_LIST:
                {
                alt106=2;
                }
                break;
            case K_SET:
                {
                alt106=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }

            switch (alt106) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:897:7: K_MAP '<' t1= comparatorType ',' t2= comparatorType '>'
                    {
                    match(input,K_MAP,FOLLOW_K_MAP_in_collection_type5752); 
                    match(input,146,FOLLOW_146_in_collection_type5755); 
                    pushFollow(FOLLOW_comparatorType_in_collection_type5759);
                    t1=comparatorType();

                    state._fsp--;

                    match(input,135,FOLLOW_135_in_collection_type5761); 
                    pushFollow(FOLLOW_comparatorType_in_collection_type5765);
                    t2=comparatorType();

                    state._fsp--;

                    match(input,148,FOLLOW_148_in_collection_type5767); 
                     try {
                                // if we can't parse either t1 or t2, antlr will "recover" and we may have t1 or t2 null.
                                if (t1 != null && t2 != null)
                                    pt = CQL3Type.Collection.map(t1, t2);
                              } catch (InvalidRequestException e) { addRecognitionError(e.getMessage()); } 

                    }
                    break;
                case 2 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:903:7: K_LIST '<' t= comparatorType '>'
                    {
                    match(input,K_LIST,FOLLOW_K_LIST_in_collection_type5785); 
                    match(input,146,FOLLOW_146_in_collection_type5787); 
                    pushFollow(FOLLOW_comparatorType_in_collection_type5791);
                    t=comparatorType();

                    state._fsp--;

                    match(input,148,FOLLOW_148_in_collection_type5793); 
                     try { if (t != null) pt = CQL3Type.Collection.list(t); } catch (InvalidRequestException e) { addRecognitionError(e.getMessage()); } 

                    }
                    break;
                case 3 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:905:7: K_SET '<' t= comparatorType '>'
                    {
                    match(input,K_SET,FOLLOW_K_SET_in_collection_type5811); 
                    match(input,146,FOLLOW_146_in_collection_type5814); 
                    pushFollow(FOLLOW_comparatorType_in_collection_type5818);
                    t=comparatorType();

                    state._fsp--;

                    match(input,148,FOLLOW_148_in_collection_type5820); 
                     try { if (t != null) pt = CQL3Type.Collection.set(t); } catch (InvalidRequestException e) { addRecognitionError(e.getMessage()); } 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return pt;
    }
    // $ANTLR end "collection_type"

    public static class username_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "username"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:909:1: username : ( IDENT | STRING_LITERAL );
    public final CqlParser.username_return username() throws RecognitionException {
        CqlParser.username_return retval = new CqlParser.username_return();
        retval.start = input.LT(1);

        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:910:5: ( IDENT | STRING_LITERAL )
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:
            {
            if ( input.LA(1)==IDENT||input.LA(1)==STRING_LITERAL ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "username"


    // $ANTLR start "unreserved_keyword"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:914:1: unreserved_keyword returns [String str] : (u= unreserved_function_keyword | k= ( K_TTL | K_COUNT | K_WRITETIME ) );
    public final String unreserved_keyword() throws RecognitionException {
        String str = null;

        Token k=null;
        String u = null;


        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:915:5: (u= unreserved_function_keyword | k= ( K_TTL | K_COUNT | K_WRITETIME ) )
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==K_AS||LA107_0==K_FILTERING||LA107_0==K_VALUES||LA107_0==K_TIMESTAMP||LA107_0==K_EXISTS||LA107_0==K_COUNTER||(LA107_0>=K_KEY && LA107_0<=K_CUSTOM)||LA107_0==K_TRIGGER||LA107_0==K_TYPE||LA107_0==K_LIST||(LA107_0>=K_ALL && LA107_0<=K_PASSWORD)||(LA107_0>=K_ASCII && LA107_0<=K_MAP)) ) {
                alt107=1;
            }
            else if ( (LA107_0==K_COUNT||(LA107_0>=K_WRITETIME && LA107_0<=K_TTL)) ) {
                alt107=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }
            switch (alt107) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:915:7: u= unreserved_function_keyword
                    {
                    pushFollow(FOLLOW_unreserved_function_keyword_in_unreserved_keyword5878);
                    u=unreserved_function_keyword();

                    state._fsp--;

                     str = u; 

                    }
                    break;
                case 2 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:916:7: k= ( K_TTL | K_COUNT | K_WRITETIME )
                    {
                    k=(Token)input.LT(1);
                    if ( input.LA(1)==K_COUNT||(input.LA(1)>=K_WRITETIME && input.LA(1)<=K_TTL) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                     str = (k!=null?k.getText():null); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return str;
    }
    // $ANTLR end "unreserved_keyword"


    // $ANTLR start "unreserved_function_keyword"
    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:919:1: unreserved_function_keyword returns [String str] : (k= ( K_KEY | K_AS | K_CLUSTERING | K_COMPACT | K_STORAGE | K_TYPE | K_VALUES | K_MAP | K_LIST | K_FILTERING | K_PERMISSION | K_PERMISSIONS | K_KEYSPACES | K_ALL | K_USER | K_USERS | K_SUPERUSER | K_NOSUPERUSER | K_PASSWORD | K_EXISTS | K_CUSTOM | K_TRIGGER ) | t= native_type );
    public final String unreserved_function_keyword() throws RecognitionException {
        String str = null;

        Token k=null;
        CQL3Type t = null;


        try {
            // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:920:5: (k= ( K_KEY | K_AS | K_CLUSTERING | K_COMPACT | K_STORAGE | K_TYPE | K_VALUES | K_MAP | K_LIST | K_FILTERING | K_PERMISSION | K_PERMISSIONS | K_KEYSPACES | K_ALL | K_USER | K_USERS | K_SUPERUSER | K_NOSUPERUSER | K_PASSWORD | K_EXISTS | K_CUSTOM | K_TRIGGER ) | t= native_type )
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==K_AS||LA108_0==K_FILTERING||LA108_0==K_VALUES||LA108_0==K_EXISTS||(LA108_0>=K_KEY && LA108_0<=K_CUSTOM)||LA108_0==K_TRIGGER||LA108_0==K_TYPE||LA108_0==K_LIST||(LA108_0>=K_ALL && LA108_0<=K_PASSWORD)||LA108_0==K_MAP) ) {
                alt108=1;
            }
            else if ( (LA108_0==K_TIMESTAMP||LA108_0==K_COUNTER||(LA108_0>=K_ASCII && LA108_0<=K_TIMEUUID)) ) {
                alt108=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }
            switch (alt108) {
                case 1 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:920:7: k= ( K_KEY | K_AS | K_CLUSTERING | K_COMPACT | K_STORAGE | K_TYPE | K_VALUES | K_MAP | K_LIST | K_FILTERING | K_PERMISSION | K_PERMISSIONS | K_KEYSPACES | K_ALL | K_USER | K_USERS | K_SUPERUSER | K_NOSUPERUSER | K_PASSWORD | K_EXISTS | K_CUSTOM | K_TRIGGER )
                    {
                    k=(Token)input.LT(1);
                    if ( input.LA(1)==K_AS||input.LA(1)==K_FILTERING||input.LA(1)==K_VALUES||input.LA(1)==K_EXISTS||(input.LA(1)>=K_KEY && input.LA(1)<=K_CUSTOM)||input.LA(1)==K_TRIGGER||input.LA(1)==K_TYPE||input.LA(1)==K_LIST||(input.LA(1)>=K_ALL && input.LA(1)<=K_PASSWORD)||input.LA(1)==K_MAP ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                     str = (k!=null?k.getText():null); 

                    }
                    break;
                case 2 :
                    // /home/david/cassandra/cassandraLalith/src/java/org/apache/cassandra/cql3/Cql.g:943:7: t= native_type
                    {
                    pushFollow(FOLLOW_native_type_in_unreserved_function_keyword6205);
                    t=native_type();

                    state._fsp--;

                     str = t.toString(); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return str;
    }
    // $ANTLR end "unreserved_function_keyword"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA79 dfa79 = new DFA79(this);
    protected DFA96 dfa96 = new DFA96(this);
    protected DFA103 dfa103 = new DFA103(this);
    static final String DFA2_eotS =
        "\35\uffff";
    static final String DFA2_eofS =
        "\35\uffff";
    static final String DFA2_minS =
        "\1\4\7\uffff\3\46\2\uffff\1\5\17\uffff";
    static final String DFA2_maxS =
        "\1\75\7\uffff\3\106\2\uffff\1\111\17\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\3\uffff\1\20\1\21\1\uffff\1"+
        "\10\1\11\1\23\1\27\1\12\1\13\1\14\1\15\1\25\1\30\1\16\1\17\1\24"+
        "\1\26\1\22";
    static final String DFA2_specialS =
        "\35\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\6\1\1\17\uffff\1\2\4\uffff\1\3\4\uffff\1\5\1\4\4\uffff\1"+
            "\10\16\uffff\1\11\1\12\4\uffff\1\7\1\13\1\14\1\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\16\1\uffff\1\17\5\uffff\2\22\3\uffff\1\21\22\uffff\1\20",
            "\1\23\1\uffff\1\24\6\uffff\1\25\3\uffff\1\27\22\uffff\1\26",
            "\1\31\1\uffff\1\30\35\uffff\1\32",
            "",
            "",
            "\1\34\37\uffff\1\34\16\uffff\2\34\12\uffff\3\34\6\uffff\1\33",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "172:1: cqlStatement returns [ParsedStatement stmt] : (st1= selectStatement | st2= insertStatement | st3= updateStatement | st4= batchStatement | st5= deleteStatement | st6= useStatement | st7= truncateStatement | st8= createKeyspaceStatement | st9= createColumnFamilyStatement | st10= createIndexStatement | st11= dropKeyspaceStatement | st12= dropColumnFamilyStatement | st13= dropIndexStatement | st14= alterTableStatement | st15= alterKeyspaceStatement | st16= grantStatement | st17= revokeStatement | st18= listPermissionsStatement | st19= createUserStatement | st20= alterUserStatement | st21= dropUserStatement | st22= listUsersStatement | st23= createTriggerStatement | st24= dropTriggerStatement );";
        }
    }
    static final String DFA13_eotS =
        "\31\uffff";
    static final String DFA13_eofS =
        "\31\uffff";
    static final String DFA13_minS =
        "\1\6\1\7\1\uffff\23\7\3\uffff";
    static final String DFA13_maxS =
        "\1\142\1\u0087\1\uffff\23\u0087\3\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\1\23\uffff\1\4\1\2\1\3";
    static final String DFA13_specialS =
        "\31\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\2\1\3\6\uffff\1\3\1\24\1\25\6\uffff\1\3\1\uffff\1\17\4\uffff"+
            "\1\3\3\uffff\1\10\7\uffff\5\3\1\uffff\1\1\2\uffff\1\3\2\uffff"+
            "\1\3\6\uffff\1\3\4\uffff\11\3\1\2\6\uffff\1\26\1\uffff\1\4\1"+
            "\5\1\6\1\7\1\11\1\12\1\13\1\14\1\15\1\16\1\20\1\21\1\22\1\23"+
            "\1\3",
            "\2\2\174\uffff\1\26\2\2",
            "",
            "\2\2\174\uffff\1\26\2\2",
            "\2\2\174\uffff\1\26\2\2",
            "\2\2\174\uffff\1\26\2\2",
            "\2\2\174\uffff\1\26\2\2",
            "\2\2\174\uffff\1\26\2\2",
            "\2\2\174\uffff\1\26\2\2",
            "\2\2\174\uffff\1\26\2\2",
            "\2\2\174\uffff\1\26\2\2",
            "\2\2\174\uffff\1\26\2\2",
            "\2\2\174\uffff\1\26\2\2",
            "\2\2\174\uffff\1\26\2\2",
            "\2\2\174\uffff\1\26\2\2",
            "\2\2\174\uffff\1\26\2\2",
            "\2\2\174\uffff\1\26\2\2",
            "\2\2\174\uffff\1\26\2\2",
            "\2\2\174\uffff\1\26\2\2",
            "\2\2\174\uffff\1\26\2\2",
            "\2\2\174\uffff\1\27\2\2",
            "\2\2\174\uffff\1\30\2\2",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "247:1: unaliasedSelector returns [Selectable s] : (c= cident | K_WRITETIME '(' c= cident ')' | K_TTL '(' c= cident ')' | f= functionName args= selectionFunctionArgs );";
        }
    }
    static final String DFA36_eotS =
        "\27\uffff";
    static final String DFA36_eofS =
        "\27\uffff";
    static final String DFA36_minS =
        "\1\6\24\10\2\uffff";
    static final String DFA36_maxS =
        "\1\142\24\u0089\2\uffff";
    static final String DFA36_acceptS =
        "\25\uffff\1\2\1\1";
    static final String DFA36_specialS =
        "\27\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\24\1\3\6\uffff\1\3\2\24\6\uffff\1\3\1\uffff\1\17\4\uffff"+
            "\1\3\3\uffff\1\10\7\uffff\5\3\1\uffff\1\1\2\uffff\1\3\2\uffff"+
            "\1\3\6\uffff\1\3\4\uffff\11\3\1\2\10\uffff\1\4\1\5\1\6\1\7\1"+
            "\11\1\12\1\13\1\14\1\15\1\16\1\20\1\21\1\22\1\23\1\3",
            "\1\26\176\uffff\1\26\1\uffff\1\25",
            "\1\26\176\uffff\1\26\1\uffff\1\25",
            "\1\26\176\uffff\1\26\1\uffff\1\25",
            "\1\26\176\uffff\1\26\1\uffff\1\25",
            "\1\26\176\uffff\1\26\1\uffff\1\25",
            "\1\26\176\uffff\1\26\1\uffff\1\25",
            "\1\26\176\uffff\1\26\1\uffff\1\25",
            "\1\26\176\uffff\1\26\1\uffff\1\25",
            "\1\26\176\uffff\1\26\1\uffff\1\25",
            "\1\26\176\uffff\1\26\1\uffff\1\25",
            "\1\26\176\uffff\1\26\1\uffff\1\25",
            "\1\26\176\uffff\1\26\1\uffff\1\25",
            "\1\26\176\uffff\1\26\1\uffff\1\25",
            "\1\26\176\uffff\1\26\1\uffff\1\25",
            "\1\26\176\uffff\1\26\1\uffff\1\25",
            "\1\26\176\uffff\1\26\1\uffff\1\25",
            "\1\26\176\uffff\1\26\1\uffff\1\25",
            "\1\26\176\uffff\1\26\1\uffff\1\25",
            "\1\26\176\uffff\1\26\1\uffff\1\25",
            "\1\26\176\uffff\1\26\1\uffff\1\25",
            "",
            ""
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "381:1: deleteOp returns [Operation.RawDeletion op] : (c= cident | c= cident '[' t= term ']' );";
        }
    }
    static final String DFA79_eotS =
        "\27\uffff";
    static final String DFA79_eofS =
        "\1\uffff\24\26\2\uffff";
    static final String DFA79_minS =
        "\1\6\24\10\2\uffff";
    static final String DFA79_maxS =
        "\1\142\24\u008b\2\uffff";
    static final String DFA79_acceptS =
        "\25\uffff\1\1\1\2";
    static final String DFA79_specialS =
        "\27\uffff}>";
    static final String[] DFA79_transitionS = {
            "\1\24\1\3\6\uffff\1\3\2\24\6\uffff\1\3\1\uffff\1\17\4\uffff"+
            "\1\3\3\uffff\1\10\7\uffff\5\3\1\uffff\1\1\2\uffff\1\3\2\uffff"+
            "\1\3\6\uffff\1\3\4\uffff\11\3\1\2\10\uffff\1\4\1\5\1\6\1\7\1"+
            "\11\1\12\1\13\1\14\1\15\1\16\1\20\1\21\1\22\1\23\1\3",
            "\3\26\1\uffff\2\26\12\uffff\1\26\2\uffff\1\26\13\uffff\1\26"+
            "\14\uffff\2\26\1\uffff\3\26\4\uffff\2\26\104\uffff\2\26\5\uffff"+
            "\1\25",
            "\3\26\1\uffff\2\26\12\uffff\1\26\2\uffff\1\26\13\uffff\1\26"+
            "\14\uffff\2\26\1\uffff\3\26\4\uffff\2\26\104\uffff\2\26\5\uffff"+
            "\1\25",
            "\3\26\1\uffff\2\26\12\uffff\1\26\2\uffff\1\26\13\uffff\1\26"+
            "\14\uffff\2\26\1\uffff\3\26\4\uffff\2\26\104\uffff\2\26\5\uffff"+
            "\1\25",
            "\3\26\1\uffff\2\26\12\uffff\1\26\2\uffff\1\26\13\uffff\1\26"+
            "\14\uffff\2\26\1\uffff\3\26\4\uffff\2\26\104\uffff\2\26\5\uffff"+
            "\1\25",
            "\3\26\1\uffff\2\26\12\uffff\1\26\2\uffff\1\26\13\uffff\1\26"+
            "\14\uffff\2\26\1\uffff\3\26\4\uffff\2\26\104\uffff\2\26\5\uffff"+
            "\1\25",
            "\3\26\1\uffff\2\26\12\uffff\1\26\2\uffff\1\26\13\uffff\1\26"+
            "\14\uffff\2\26\1\uffff\3\26\4\uffff\2\26\104\uffff\2\26\5\uffff"+
            "\1\25",
            "\3\26\1\uffff\2\26\12\uffff\1\26\2\uffff\1\26\13\uffff\1\26"+
            "\14\uffff\2\26\1\uffff\3\26\4\uffff\2\26\104\uffff\2\26\5\uffff"+
            "\1\25",
            "\3\26\1\uffff\2\26\12\uffff\1\26\2\uffff\1\26\13\uffff\1\26"+
            "\14\uffff\2\26\1\uffff\3\26\4\uffff\2\26\104\uffff\2\26\5\uffff"+
            "\1\25",
            "\3\26\1\uffff\2\26\12\uffff\1\26\2\uffff\1\26\13\uffff\1\26"+
            "\14\uffff\2\26\1\uffff\3\26\4\uffff\2\26\104\uffff\2\26\5\uffff"+
            "\1\25",
            "\3\26\1\uffff\2\26\12\uffff\1\26\2\uffff\1\26\13\uffff\1\26"+
            "\14\uffff\2\26\1\uffff\3\26\4\uffff\2\26\104\uffff\2\26\5\uffff"+
            "\1\25",
            "\3\26\1\uffff\2\26\12\uffff\1\26\2\uffff\1\26\13\uffff\1\26"+
            "\14\uffff\2\26\1\uffff\3\26\4\uffff\2\26\104\uffff\2\26\5\uffff"+
            "\1\25",
            "\3\26\1\uffff\2\26\12\uffff\1\26\2\uffff\1\26\13\uffff\1\26"+
            "\14\uffff\2\26\1\uffff\3\26\4\uffff\2\26\104\uffff\2\26\5\uffff"+
            "\1\25",
            "\3\26\1\uffff\2\26\12\uffff\1\26\2\uffff\1\26\13\uffff\1\26"+
            "\14\uffff\2\26\1\uffff\3\26\4\uffff\2\26\104\uffff\2\26\5\uffff"+
            "\1\25",
            "\3\26\1\uffff\2\26\12\uffff\1\26\2\uffff\1\26\13\uffff\1\26"+
            "\14\uffff\2\26\1\uffff\3\26\4\uffff\2\26\104\uffff\2\26\5\uffff"+
            "\1\25",
            "\3\26\1\uffff\2\26\12\uffff\1\26\2\uffff\1\26\13\uffff\1\26"+
            "\14\uffff\2\26\1\uffff\3\26\4\uffff\2\26\104\uffff\2\26\5\uffff"+
            "\1\25",
            "\3\26\1\uffff\2\26\12\uffff\1\26\2\uffff\1\26\13\uffff\1\26"+
            "\14\uffff\2\26\1\uffff\3\26\4\uffff\2\26\104\uffff\2\26\5\uffff"+
            "\1\25",
            "\3\26\1\uffff\2\26\12\uffff\1\26\2\uffff\1\26\13\uffff\1\26"+
            "\14\uffff\2\26\1\uffff\3\26\4\uffff\2\26\104\uffff\2\26\5\uffff"+
            "\1\25",
            "\3\26\1\uffff\2\26\12\uffff\1\26\2\uffff\1\26\13\uffff\1\26"+
            "\14\uffff\2\26\1\uffff\3\26\4\uffff\2\26\104\uffff\2\26\5\uffff"+
            "\1\25",
            "\3\26\1\uffff\2\26\12\uffff\1\26\2\uffff\1\26\13\uffff\1\26"+
            "\14\uffff\2\26\1\uffff\3\26\4\uffff\2\26\104\uffff\2\26\5\uffff"+
            "\1\25",
            "\3\26\1\uffff\2\26\12\uffff\1\26\2\uffff\1\26\13\uffff\1\26"+
            "\14\uffff\2\26\1\uffff\3\26\4\uffff\2\26\104\uffff\2\26\5\uffff"+
            "\1\25",
            "",
            ""
    };

    static final short[] DFA79_eot = DFA.unpackEncodedString(DFA79_eotS);
    static final short[] DFA79_eof = DFA.unpackEncodedString(DFA79_eofS);
    static final char[] DFA79_min = DFA.unpackEncodedStringToUnsignedChars(DFA79_minS);
    static final char[] DFA79_max = DFA.unpackEncodedStringToUnsignedChars(DFA79_maxS);
    static final short[] DFA79_accept = DFA.unpackEncodedString(DFA79_acceptS);
    static final short[] DFA79_special = DFA.unpackEncodedString(DFA79_specialS);
    static final short[][] DFA79_transition;

    static {
        int numStates = DFA79_transitionS.length;
        DFA79_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA79_transition[i] = DFA.unpackEncodedString(DFA79_transitionS[i]);
        }
    }

    class DFA79 extends DFA {

        public DFA79(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 79;
            this.eot = DFA79_eot;
            this.eof = DFA79_eof;
            this.min = DFA79_min;
            this.max = DFA79_max;
            this.accept = DFA79_accept;
            this.special = DFA79_special;
            this.transition = DFA79_transition;
        }
        public String getDescription() {
            return "712:7: ( cfOrKsName[name, true] '.' )?";
        }
    }
    static final String DFA96_eotS =
        "\56\uffff";
    static final String DFA96_eofS =
        "\56\uffff";
    static final String DFA96_minS =
        "\1\6\24\u0089\1\6\2\uffff\24\21\2\uffff";
    static final String DFA96_maxS =
        "\1\142\24\u008f\1\u008e\2\uffff\24\u0091\2\uffff";
    static final String DFA96_acceptS =
        "\26\uffff\1\4\1\1\24\uffff\1\2\1\3";
    static final String DFA96_specialS =
        "\56\uffff}>";
    static final String[] DFA96_transitionS = {
            "\1\24\1\3\6\uffff\1\3\2\24\6\uffff\1\3\1\uffff\1\17\4\uffff"+
            "\1\3\3\uffff\1\10\7\uffff\5\3\1\uffff\1\1\2\uffff\1\3\2\uffff"+
            "\1\3\6\uffff\1\3\4\uffff\11\3\1\2\10\uffff\1\4\1\5\1\6\1\7\1"+
            "\11\1\12\1\13\1\14\1\15\1\16\1\20\1\21\1\22\1\23\1\3",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\53\1\31\6\uffff\1\31\2\53\1\27\5\uffff\1\31\1\uffff\1\45"+
            "\4\uffff\1\31\3\uffff\1\36\7\uffff\5\31\1\uffff\1\30\1\uffff"+
            "\1\27\1\31\2\uffff\1\31\6\uffff\1\31\4\uffff\11\31\1\52\7\27"+
            "\1\uffff\1\32\1\33\1\34\1\35\1\37\1\40\1\41\1\42\1\43\1\44\1"+
            "\46\1\47\1\50\1\51\1\31\42\uffff\1\27\3\uffff\1\27\4\uffff\1"+
            "\27",
            "",
            "",
            "\1\55\163\uffff\1\27\12\uffff\2\54",
            "\1\55\163\uffff\1\27\12\uffff\2\54",
            "\1\55\163\uffff\1\27\12\uffff\2\54",
            "\1\55\163\uffff\1\27\12\uffff\2\54",
            "\1\55\163\uffff\1\27\12\uffff\2\54",
            "\1\55\163\uffff\1\27\12\uffff\2\54",
            "\1\55\163\uffff\1\27\12\uffff\2\54",
            "\1\55\163\uffff\1\27\12\uffff\2\54",
            "\1\55\163\uffff\1\27\12\uffff\2\54",
            "\1\55\163\uffff\1\27\12\uffff\2\54",
            "\1\55\163\uffff\1\27\12\uffff\2\54",
            "\1\55\163\uffff\1\27\12\uffff\2\54",
            "\1\55\163\uffff\1\27\12\uffff\2\54",
            "\1\55\163\uffff\1\27\12\uffff\2\54",
            "\1\55\163\uffff\1\27\12\uffff\2\54",
            "\1\55\163\uffff\1\27\12\uffff\2\54",
            "\1\55\163\uffff\1\27\12\uffff\2\54",
            "\1\55\163\uffff\1\27\12\uffff\2\54",
            "\1\55\176\uffff\2\54",
            "\1\55\176\uffff\2\54",
            "",
            ""
    };

    static final short[] DFA96_eot = DFA.unpackEncodedString(DFA96_eotS);
    static final short[] DFA96_eof = DFA.unpackEncodedString(DFA96_eofS);
    static final char[] DFA96_min = DFA.unpackEncodedStringToUnsignedChars(DFA96_minS);
    static final char[] DFA96_max = DFA.unpackEncodedStringToUnsignedChars(DFA96_maxS);
    static final short[] DFA96_accept = DFA.unpackEncodedString(DFA96_acceptS);
    static final short[] DFA96_special = DFA.unpackEncodedString(DFA96_specialS);
    static final short[][] DFA96_transition;

    static {
        int numStates = DFA96_transitionS.length;
        DFA96_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA96_transition[i] = DFA.unpackEncodedString(DFA96_transitionS[i]);
        }
    }

    class DFA96 extends DFA {

        public DFA96(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 96;
            this.eot = DFA96_eot;
            this.eof = DFA96_eof;
            this.min = DFA96_min;
            this.max = DFA96_max;
            this.accept = DFA96_accept;
            this.special = DFA96_special;
            this.transition = DFA96_transition;
        }
        public String getDescription() {
            return "792:1: columnOperation[List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations] : (key= cident '=' t= term ( '+' c= cident )? | key= cident '=' c= cident sig= ( '+' | '-' ) t= term | key= cident '=' c= cident i= INTEGER | key= cident '[' k= term ']' '=' t= term );";
        }
    }
    static final String DFA103_eotS =
        "\30\uffff";
    static final String DFA103_eofS =
        "\30\uffff";
    static final String DFA103_minS =
        "\1\6\24\123\3\uffff";
    static final String DFA103_maxS =
        "\1\142\24\u0095\3\uffff";
    static final String DFA103_acceptS =
        "\25\uffff\1\2\1\1\1\3";
    static final String DFA103_specialS =
        "\30\uffff}>";
    static final String[] DFA103_transitionS = {
            "\1\24\1\3\6\uffff\1\3\2\24\6\uffff\1\3\1\uffff\1\17\4\uffff"+
            "\1\3\3\uffff\1\10\7\uffff\5\3\1\uffff\1\1\2\uffff\1\3\2\uffff"+
            "\1\3\6\uffff\1\3\4\uffff\11\3\1\2\6\uffff\1\25\1\uffff\1\4\1"+
            "\5\1\6\1\7\1\11\1\12\1\13\1\14\1\15\1\16\1\20\1\21\1\22\1\23"+
            "\1\3",
            "\1\27\73\uffff\1\26\2\uffff\4\26",
            "\1\27\73\uffff\1\26\2\uffff\4\26",
            "\1\27\73\uffff\1\26\2\uffff\4\26",
            "\1\27\73\uffff\1\26\2\uffff\4\26",
            "\1\27\73\uffff\1\26\2\uffff\4\26",
            "\1\27\73\uffff\1\26\2\uffff\4\26",
            "\1\27\73\uffff\1\26\2\uffff\4\26",
            "\1\27\73\uffff\1\26\2\uffff\4\26",
            "\1\27\73\uffff\1\26\2\uffff\4\26",
            "\1\27\73\uffff\1\26\2\uffff\4\26",
            "\1\27\73\uffff\1\26\2\uffff\4\26",
            "\1\27\73\uffff\1\26\2\uffff\4\26",
            "\1\27\73\uffff\1\26\2\uffff\4\26",
            "\1\27\73\uffff\1\26\2\uffff\4\26",
            "\1\27\73\uffff\1\26\2\uffff\4\26",
            "\1\27\73\uffff\1\26\2\uffff\4\26",
            "\1\27\73\uffff\1\26\2\uffff\4\26",
            "\1\27\73\uffff\1\26\2\uffff\4\26",
            "\1\27\73\uffff\1\26\2\uffff\4\26",
            "\1\27\73\uffff\1\26\2\uffff\4\26",
            "",
            "",
            ""
    };

    static final short[] DFA103_eot = DFA.unpackEncodedString(DFA103_eotS);
    static final short[] DFA103_eof = DFA.unpackEncodedString(DFA103_eofS);
    static final char[] DFA103_min = DFA.unpackEncodedStringToUnsignedChars(DFA103_minS);
    static final char[] DFA103_max = DFA.unpackEncodedStringToUnsignedChars(DFA103_maxS);
    static final short[] DFA103_accept = DFA.unpackEncodedString(DFA103_acceptS);
    static final short[] DFA103_special = DFA.unpackEncodedString(DFA103_specialS);
    static final short[][] DFA103_transition;

    static {
        int numStates = DFA103_transitionS.length;
        DFA103_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA103_transition[i] = DFA.unpackEncodedString(DFA103_transitionS[i]);
        }
    }

    class DFA103 extends DFA {

        public DFA103(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 103;
            this.eot = DFA103_eot;
            this.eof = DFA103_eof;
            this.min = DFA103_min;
            this.max = DFA103_max;
            this.accept = DFA103_accept;
            this.special = DFA103_special;
            this.transition = DFA103_transition;
        }
        public String getDescription() {
            return "848:1: relation[List<Relation> clauses] : (name= cident type= relationType t= term | K_TOKEN '(' name1= cident ( ',' namen= cident )* ')' type= relationType t= term | name= cident K_IN '(' f1= term ( ',' fN= term )* ')' );";
        }
    }
 

    public static final BitSet FOLLOW_cqlStatement_in_query72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_query75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_EOF_in_query79 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectStatement_in_cqlStatement113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insertStatement_in_cqlStatement138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_updateStatement_in_cqlStatement163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_batchStatement_in_cqlStatement188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_deleteStatement_in_cqlStatement214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_useStatement_in_cqlStatement239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_truncateStatement_in_cqlStatement267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createKeyspaceStatement_in_cqlStatement290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createColumnFamilyStatement_in_cqlStatement307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createIndexStatement_in_cqlStatement319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropKeyspaceStatement_in_cqlStatement338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropColumnFamilyStatement_in_cqlStatement356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropIndexStatement_in_cqlStatement370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterTableStatement_in_cqlStatement391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterKeyspaceStatement_in_cqlStatement411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_grantStatement_in_cqlStatement428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_revokeStatement_in_cqlStatement453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_listPermissionsStatement_in_cqlStatement477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createUserStatement_in_cqlStatement492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterUserStatement_in_cqlStatement512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropUserStatement_in_cqlStatement533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_listUsersStatement_in_cqlStatement555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createTriggerStatement_in_cqlStatement576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropTriggerStatement_in_cqlStatement593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_USE_in_useStatement623 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_keyspaceName_in_useStatement627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_SELECT_in_selectStatement661 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF40FFCL,0x0000000000000100L});
    public static final BitSet FOLLOW_selectClause_in_selectStatement667 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_K_COUNT_in_selectStatement687 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_selectStatement689 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_selectCountClause_in_selectStatement693 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_134_in_selectStatement695 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_K_AS_in_selectStatement700 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_cident_in_selectStatement704 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_K_FROM_in_selectStatement719 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_columnFamilyName_in_selectStatement723 = new BitSet(new long[]{0x0000000000003602L});
    public static final BitSet FOLLOW_K_WHERE_in_selectStatement733 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF40FFCL});
    public static final BitSet FOLLOW_whereClause_in_selectStatement737 = new BitSet(new long[]{0x0000000000003402L});
    public static final BitSet FOLLOW_K_ORDER_in_selectStatement750 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_K_BY_in_selectStatement752 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_orderByClause_in_selectStatement754 = new BitSet(new long[]{0x0000000000003002L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_selectStatement759 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_orderByClause_in_selectStatement761 = new BitSet(new long[]{0x0000000000003002L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_K_LIMIT_in_selectStatement778 = new BitSet(new long[]{0x0000000000022000L,0x0000000000020000L});
    public static final BitSet FOLLOW_intValue_in_selectStatement782 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_K_ALLOW_in_selectStatement797 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_K_FILTERING_in_selectStatement799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selector_in_selectClause836 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_selectClause841 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF40FFCL});
    public static final BitSet FOLLOW_selector_in_selectClause845 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_136_in_selectClause857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaliasedSelector_in_selector890 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_K_AS_in_selector893 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_cident_in_selector897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_unaliasedSelector926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_WRITETIME_in_unaliasedSelector969 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_unaliasedSelector971 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_cident_in_unaliasedSelector975 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_134_in_unaliasedSelector977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TTL_in_unaliasedSelector1000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_unaliasedSelector1008 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_cident_in_unaliasedSelector1012 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_134_in_unaliasedSelector1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionName_in_unaliasedSelector1039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_selectionFunctionArgs_in_unaliasedSelector1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_selectionFunctionArgs1066 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_134_in_selectionFunctionArgs1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_selectionFunctionArgs1078 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF40FFCL});
    public static final BitSet FOLLOW_unaliasedSelector_in_selectionFunctionArgs1082 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_135_in_selectionFunctionArgs1098 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF40FFCL});
    public static final BitSet FOLLOW_unaliasedSelector_in_selectionFunctionArgs1102 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_134_in_selectionFunctionArgs1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_selectCountClause1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_selectCountClause1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relation_in_whereClause1197 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_K_AND_in_whereClause1201 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF40FFCL});
    public static final BitSet FOLLOW_relation_in_whereClause1203 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_cident_in_orderByClause1234 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_K_ASC_in_orderByClause1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DESC_in_orderByClause1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_INSERT_in_insertStatement1281 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_K_INTO_in_insertStatement1283 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_columnFamilyName_in_insertStatement1287 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_insertStatement1299 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_cident_in_insertStatement1303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_135_in_insertStatement1310 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_cident_in_insertStatement1314 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_134_in_insertStatement1321 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_K_VALUES_in_insertStatement1331 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_insertStatement1343 = new BitSet(new long[]{0x204D7C044283C0C0L,0x00000007FFF7FFFCL,0x0000000000004220L});
    public static final BitSet FOLLOW_term_in_insertStatement1347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_135_in_insertStatement1353 = new BitSet(new long[]{0x204D7C044283C0C0L,0x00000007FFF7FFFCL,0x0000000000004220L});
    public static final BitSet FOLLOW_term_in_insertStatement1357 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_134_in_insertStatement1364 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_usingClause_in_insertStatement1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_USING_in_usingClause1406 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_usingClauseObjective_in_usingClause1408 = new BitSet(new long[]{0x0000000002050002L});
    public static final BitSet FOLLOW_K_AND_in_usingClause1413 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_usingClauseObjective_in_usingClause1416 = new BitSet(new long[]{0x0000000002050002L});
    public static final BitSet FOLLOW_K_USING_in_usingClauseDelete1438 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_usingClauseDeleteObjective_in_usingClauseDelete1440 = new BitSet(new long[]{0x0000000002040002L});
    public static final BitSet FOLLOW_K_AND_in_usingClauseDelete1445 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_usingClauseDeleteObjective_in_usingClauseDelete1448 = new BitSet(new long[]{0x0000000002040002L});
    public static final BitSet FOLLOW_K_TIMESTAMP_in_usingClauseDeleteObjective1470 = new BitSet(new long[]{0x0000000000020000L,0x0000000000020000L});
    public static final BitSet FOLLOW_intValue_in_usingClauseDeleteObjective1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_usingClauseDeleteObjective_in_usingClauseObjective1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TTL_in_usingClauseObjective1503 = new BitSet(new long[]{0x0000000000020000L,0x0000000000020000L});
    public static final BitSet FOLLOW_intValue_in_usingClauseObjective1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_UPDATE_in_updateStatement1541 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_columnFamilyName_in_updateStatement1545 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_usingClause_in_updateStatement1555 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_K_SET_in_updateStatement1567 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_columnOperation_in_updateStatement1569 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_updateStatement1573 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_columnOperation_in_updateStatement1575 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_K_WHERE_in_updateStatement1586 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF40FFCL});
    public static final BitSet FOLLOW_whereClause_in_updateStatement1590 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_K_IF_in_updateStatement1600 = new BitSet(new long[]{0x20497C046281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_K_NOT_in_updateStatement1603 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_K_EXISTS_in_updateStatement1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_updateCondition_in_updateStatement1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_columnOperation_in_updateCondition1655 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_K_AND_in_updateCondition1660 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_columnOperation_in_updateCondition1662 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_K_DELETE_in_deleteStatement1698 = new BitSet(new long[]{0x20497C044281C1C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_deleteSelection_in_deleteStatement1704 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_K_FROM_in_deleteStatement1717 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_columnFamilyName_in_deleteStatement1721 = new BitSet(new long[]{0x0000000001000200L});
    public static final BitSet FOLLOW_usingClauseDelete_in_deleteStatement1731 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_K_WHERE_in_deleteStatement1743 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF40FFCL});
    public static final BitSet FOLLOW_whereClause_in_deleteStatement1747 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_K_IF_in_deleteStatement1757 = new BitSet(new long[]{0x20497C046281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_updateCondition_in_deleteStatement1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_deleteOp_in_deleteSelection1807 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_deleteSelection1822 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_deleteOp_in_deleteSelection1826 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_cident_in_deleteOp1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_deleteOp1880 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_deleteOp1882 = new BitSet(new long[]{0x204D7C044283C0C0L,0x00000007FFF7FFFCL,0x0000000000004220L});
    public static final BitSet FOLLOW_term_in_deleteOp1886 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_deleteOp1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_BEGIN_in_batchStatement1922 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_K_UNLOGGED_in_batchStatement1932 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_K_COUNTER_in_batchStatement1938 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_K_BATCH_in_batchStatement1951 = new BitSet(new long[]{0x0000000085200000L});
    public static final BitSet FOLLOW_usingClause_in_batchStatement1955 = new BitSet(new long[]{0x0000000085200000L});
    public static final BitSet FOLLOW_batchStatementObjective_in_batchStatement1973 = new BitSet(new long[]{0x0000001085200000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_batchStatement1975 = new BitSet(new long[]{0x0000001085200000L});
    public static final BitSet FOLLOW_batchStatementObjective_in_batchStatement1984 = new BitSet(new long[]{0x0000001085200000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_batchStatement1986 = new BitSet(new long[]{0x0000001085200000L});
    public static final BitSet FOLLOW_K_APPLY_in_batchStatement2000 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_K_BATCH_in_batchStatement2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insertStatement_in_batchStatementObjective2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_updateStatement_in_batchStatementObjective2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_deleteStatement_in_batchStatementObjective2059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CREATE_in_createKeyspaceStatement2094 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_K_KEYSPACE_in_createKeyspaceStatement2096 = new BitSet(new long[]{0x20497C045281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_K_IF_in_createKeyspaceStatement2099 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_K_NOT_in_createKeyspaceStatement2101 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_K_EXISTS_in_createKeyspaceStatement2103 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_keyspaceName_in_createKeyspaceStatement2112 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_K_WITH_in_createKeyspaceStatement2120 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_properties_in_createKeyspaceStatement2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CREATE_in_createColumnFamilyStatement2157 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_K_COLUMNFAMILY_in_createColumnFamilyStatement2159 = new BitSet(new long[]{0x20497C045281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_K_IF_in_createColumnFamilyStatement2162 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_K_NOT_in_createColumnFamilyStatement2164 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_K_EXISTS_in_createColumnFamilyStatement2166 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_columnFamilyName_in_createColumnFamilyStatement2181 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_cfamDefinition_in_createColumnFamilyStatement2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_cfamDefinition2210 = new BitSet(new long[]{0x20497E044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_cfamColumns_in_cfamDefinition2212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_135_in_cfamDefinition2217 = new BitSet(new long[]{0x20497E044281C0C0L,0x00000007FFF00FFCL,0x00000000000000C0L});
    public static final BitSet FOLLOW_cfamColumns_in_cfamDefinition2219 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_134_in_cfamDefinition2226 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_K_WITH_in_cfamDefinition2236 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_cfamProperty_in_cfamDefinition2238 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_K_AND_in_cfamDefinition2243 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_cfamProperty_in_cfamDefinition2245 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_cident_in_cfamColumns2271 = new BitSet(new long[]{0x204C7C044A804080L,0x00000007FFF007FCL});
    public static final BitSet FOLLOW_comparatorType_in_cfamColumns2275 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_K_PRIMARY_in_cfamColumns2280 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_K_KEY_in_cfamColumns2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_PRIMARY_in_cfamColumns2294 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_K_KEY_in_cfamColumns2296 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_cfamColumns2298 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL,0x0000000000000020L});
    public static final BitSet FOLLOW_pkDef_in_cfamColumns2300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_135_in_cfamColumns2304 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_cident_in_cfamColumns2308 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_134_in_cfamColumns2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_pkDef2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_pkDef2345 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_cident_in_pkDef2351 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_135_in_pkDef2357 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_cident_in_pkDef2361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_134_in_pkDef2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_in_cfamProperty2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_COMPACT_in_cfamProperty2397 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_K_STORAGE_in_cfamProperty2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CLUSTERING_in_cfamProperty2409 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_K_ORDER_in_cfamProperty2411 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_K_BY_in_cfamProperty2413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_cfamProperty2415 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_cfamOrdering_in_cfamProperty2417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_135_in_cfamProperty2421 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_cfamOrdering_in_cfamProperty2423 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_134_in_cfamProperty2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_cfamOrdering2456 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_K_ASC_in_cfamOrdering2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DESC_in_cfamOrdering2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CREATE_in_createIndexStatement2501 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_K_CUSTOM_in_createIndexStatement2504 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_K_INDEX_in_createIndexStatement2510 = new BitSet(new long[]{0x0003000010000000L});
    public static final BitSet FOLLOW_K_IF_in_createIndexStatement2513 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_K_NOT_in_createIndexStatement2515 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_K_EXISTS_in_createIndexStatement2517 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_IDENT_in_createIndexStatement2535 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_K_ON_in_createIndexStatement2539 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_columnFamilyName_in_createIndexStatement2543 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_createIndexStatement2545 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_cident_in_createIndexStatement2549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_134_in_createIndexStatement2551 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_K_USING_in_createIndexStatement2563 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_createIndexStatement2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CREATE_in_createTriggerStatement2601 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_K_TRIGGER_in_createTriggerStatement2603 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENT_in_createTriggerStatement2608 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_K_ON_in_createTriggerStatement2611 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_columnFamilyName_in_createTriggerStatement2615 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_K_USING_in_createTriggerStatement2617 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_createTriggerStatement2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DROP_in_dropTriggerStatement2652 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_K_TRIGGER_in_dropTriggerStatement2654 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENT_in_dropTriggerStatement2659 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_K_ON_in_dropTriggerStatement2662 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_columnFamilyName_in_dropTriggerStatement2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ALTER_in_alterKeyspaceStatement2706 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_K_KEYSPACE_in_alterKeyspaceStatement2708 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_keyspaceName_in_alterKeyspaceStatement2712 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_K_WITH_in_alterKeyspaceStatement2722 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_properties_in_alterKeyspaceStatement2724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ALTER_in_alterTableStatement2760 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_K_COLUMNFAMILY_in_alterTableStatement2762 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_columnFamilyName_in_alterTableStatement2766 = new BitSet(new long[]{0x01B0008000000000L});
    public static final BitSet FOLLOW_K_ALTER_in_alterTableStatement2780 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_cident_in_alterTableStatement2784 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_K_TYPE_in_alterTableStatement2786 = new BitSet(new long[]{0x204C7C044A804080L,0x00000007FFF007FCL});
    public static final BitSet FOLLOW_comparatorType_in_alterTableStatement2790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ADD_in_alterTableStatement2806 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_cident_in_alterTableStatement2812 = new BitSet(new long[]{0x204C7C044A804080L,0x00000007FFF007FCL});
    public static final BitSet FOLLOW_comparatorType_in_alterTableStatement2816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DROP_in_alterTableStatement2839 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_cident_in_alterTableStatement2844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_WITH_in_alterTableStatement2884 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_properties_in_alterTableStatement2887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_RENAME_in_alterTableStatement2920 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_cident_in_alterTableStatement2974 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_K_TO_in_alterTableStatement2976 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_cident_in_alterTableStatement2980 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_K_AND_in_alterTableStatement3001 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_cident_in_alterTableStatement3005 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_K_TO_in_alterTableStatement3007 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_cident_in_alterTableStatement3011 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_K_DROP_in_dropKeyspaceStatement3066 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_K_KEYSPACE_in_dropKeyspaceStatement3068 = new BitSet(new long[]{0x20497C045281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_K_IF_in_dropKeyspaceStatement3071 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_K_EXISTS_in_dropKeyspaceStatement3073 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_keyspaceName_in_dropKeyspaceStatement3082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DROP_in_dropColumnFamilyStatement3116 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_K_COLUMNFAMILY_in_dropColumnFamilyStatement3118 = new BitSet(new long[]{0x20497C045281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_K_IF_in_dropColumnFamilyStatement3121 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_K_EXISTS_in_dropColumnFamilyStatement3123 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_columnFamilyName_in_dropColumnFamilyStatement3132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DROP_in_dropIndexStatement3166 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_K_INDEX_in_dropIndexStatement3168 = new BitSet(new long[]{0x0001000010000000L});
    public static final BitSet FOLLOW_K_IF_in_dropIndexStatement3171 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_K_EXISTS_in_dropIndexStatement3173 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IDENT_in_dropIndexStatement3182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TRUNCATE_in_truncateStatement3213 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_columnFamilyName_in_truncateStatement3217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_GRANT_in_grantStatement3242 = new BitSet(new long[]{0x0030002000000020L,0x0000000000000007L});
    public static final BitSet FOLLOW_permissionOrAll_in_grantStatement3254 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_K_ON_in_grantStatement3262 = new BitSet(new long[]{0x20497D444281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_resource_in_grantStatement3274 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_K_TO_in_grantStatement3282 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_username_in_grantStatement3294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_REVOKE_in_revokeStatement3325 = new BitSet(new long[]{0x0030002000000020L,0x0000000000000007L});
    public static final BitSet FOLLOW_permissionOrAll_in_revokeStatement3337 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_K_ON_in_revokeStatement3345 = new BitSet(new long[]{0x20497D444281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_resource_in_revokeStatement3357 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_K_FROM_in_revokeStatement3365 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_username_in_revokeStatement3377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_LIST_in_listPermissionsStatement3415 = new BitSet(new long[]{0x0030002000000020L,0x0000000000000007L});
    public static final BitSet FOLLOW_permissionOrAll_in_listPermissionsStatement3427 = new BitSet(new long[]{0xC002000000000002L});
    public static final BitSet FOLLOW_K_ON_in_listPermissionsStatement3437 = new BitSet(new long[]{0x20497D444281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_resource_in_listPermissionsStatement3439 = new BitSet(new long[]{0xC000000000000002L});
    public static final BitSet FOLLOW_K_OF_in_listPermissionsStatement3454 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_username_in_listPermissionsStatement3456 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_K_NORECURSIVE_in_listPermissionsStatement3471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_permission3507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ALL_in_permissionOrAll3556 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_K_PERMISSIONS_in_permissionOrAll3560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_permission_in_permissionOrAll3581 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_K_PERMISSION_in_permissionOrAll3585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dataResource_in_resource3613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ALL_in_dataResource3636 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_K_KEYSPACES_in_dataResource3638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_KEYSPACE_in_dataResource3648 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_keyspaceName_in_dataResource3654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_COLUMNFAMILY_in_dataResource3666 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_columnFamilyName_in_dataResource3675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CREATE_in_createUserStatement3715 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_K_USER_in_createUserStatement3717 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_username_in_createUserStatement3719 = new BitSet(new long[]{0x0000008000000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_K_WITH_in_createUserStatement3729 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_userOptions_in_createUserStatement3731 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_K_SUPERUSER_in_createUserStatement3745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_NOSUPERUSER_in_createUserStatement3751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ALTER_in_alterUserStatement3796 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_K_USER_in_alterUserStatement3798 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_username_in_alterUserStatement3800 = new BitSet(new long[]{0x0000008000000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_K_WITH_in_alterUserStatement3810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_userOptions_in_alterUserStatement3812 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000180L});
    public static final BitSet FOLLOW_K_SUPERUSER_in_alterUserStatement3826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_NOSUPERUSER_in_alterUserStatement3832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DROP_in_dropUserStatement3868 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_K_USER_in_dropUserStatement3870 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_username_in_dropUserStatement3872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_LIST_in_listUsersStatement3897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_K_USERS_in_listUsersStatement3899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_userOption_in_userOptions3919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_PASSWORD_in_userOption3940 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_userOption3944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_cident3973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_NAME_in_cident3998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unreserved_keyword_in_cident4017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cfOrKsName_in_keyspaceName4050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cfOrKsName_in_columnFamilyName4084 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_columnFamilyName4087 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_cfOrKsName_in_columnFamilyName4091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_cfOrKsName4112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_NAME_in_cfOrKsName4137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unreserved_keyword_in_cfOrKsName4156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_constant4181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_constant4193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_constant4212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_constant4233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UUID_in_constant4252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXNUMBER_in_constant4274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_set_tail4299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_set_tail4307 = new BitSet(new long[]{0x204D7C044283C0C0L,0x00000007FFF7FFFCL,0x0000000000004220L});
    public static final BitSet FOLLOW_term_in_set_tail4311 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001080L});
    public static final BitSet FOLLOW_set_tail_in_set_tail4315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_map_tail4334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_map_tail4342 = new BitSet(new long[]{0x204D7C044283C0C0L,0x00000007FFF7FFFCL,0x0000000000004220L});
    public static final BitSet FOLLOW_term_in_map_tail4346 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_map_tail4348 = new BitSet(new long[]{0x204D7C044283C0C0L,0x00000007FFF7FFFCL,0x0000000000004220L});
    public static final BitSet FOLLOW_term_in_map_tail4352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001080L});
    public static final BitSet FOLLOW_map_tail_in_map_tail4356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_map_literal4378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_map_literal4380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_map_literal4390 = new BitSet(new long[]{0x204D7C044283C0C0L,0x00000007FFF7FFFCL,0x0000000000004220L});
    public static final BitSet FOLLOW_term_in_map_literal4406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_map_literal4408 = new BitSet(new long[]{0x204D7C044283C0C0L,0x00000007FFF7FFFCL,0x0000000000004220L});
    public static final BitSet FOLLOW_term_in_map_literal4412 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001080L});
    public static final BitSet FOLLOW_map_tail_in_map_literal4416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_set_or_map4448 = new BitSet(new long[]{0x204D7C044283C0C0L,0x00000007FFF7FFFCL,0x0000000000004220L});
    public static final BitSet FOLLOW_term_in_set_or_map4452 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001080L});
    public static final BitSet FOLLOW_map_tail_in_set_or_map4456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_tail_in_set_or_map4469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_collection_literal4494 = new BitSet(new long[]{0x204D7C044283C0C0L,0x00000007FFF7FFFCL,0x0000000000004620L});
    public static final BitSet FOLLOW_term_in_collection_literal4502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000480L});
    public static final BitSet FOLLOW_135_in_collection_literal4508 = new BitSet(new long[]{0x204D7C044283C0C0L,0x00000007FFF7FFFCL,0x0000000000004220L});
    public static final BitSet FOLLOW_term_in_collection_literal4512 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000480L});
    public static final BitSet FOLLOW_138_in_collection_literal4522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_collection_literal4532 = new BitSet(new long[]{0x204D7C044283C0C0L,0x00000007FFF7FFFCL,0x0000000000004220L});
    public static final BitSet FOLLOW_term_in_collection_literal4536 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000003080L});
    public static final BitSet FOLLOW_set_or_map_in_collection_literal4540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_collection_literal4556 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_140_in_collection_literal4558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_value4583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collection_literal_in_value4605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_NULL_in_value4615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QMARK_in_value4639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_intValue4685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QMARK_in_intValue4695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_functionName4724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unreserved_function_keyword_in_functionName4758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TOKEN_in_functionName4768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_functionArgs4813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_134_in_functionArgs4815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_functionArgs4825 = new BitSet(new long[]{0x204D7C044283C0C0L,0x00000007FFF7FFFCL,0x0000000000004220L});
    public static final BitSet FOLLOW_term_in_functionArgs4829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_135_in_functionArgs4845 = new BitSet(new long[]{0x204D7C044283C0C0L,0x00000007FFF7FFFCL,0x0000000000004220L});
    public static final BitSet FOLLOW_term_in_functionArgs4849 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_134_in_functionArgs4863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_term4888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionName_in_term4925 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_functionArgs_in_term4929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_term4939 = new BitSet(new long[]{0x204C7C044A804080L,0x00000007FFF007FCL});
    public static final BitSet FOLLOW_comparatorType_in_term4943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_134_in_term4945 = new BitSet(new long[]{0x204D7C044283C0C0L,0x00000007FFF7FFFCL,0x0000000000004220L});
    public static final BitSet FOLLOW_term_in_term4949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_columnOperation4972 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_143_in_columnOperation4974 = new BitSet(new long[]{0x204D7C044283C0C0L,0x00000007FFF7FFFCL,0x0000000000004220L});
    public static final BitSet FOLLOW_term_in_columnOperation4978 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_144_in_columnOperation4981 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_cident_in_columnOperation4985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_columnOperation5006 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_143_in_columnOperation5008 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_cident_in_columnOperation5012 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000030000L});
    public static final BitSet FOLLOW_set_in_columnOperation5016 = new BitSet(new long[]{0x204D7C044283C0C0L,0x00000007FFF7FFFCL,0x0000000000004220L});
    public static final BitSet FOLLOW_term_in_columnOperation5026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_columnOperation5044 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_143_in_columnOperation5046 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_cident_in_columnOperation5050 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_INTEGER_in_columnOperation5054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_columnOperation5072 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_columnOperation5074 = new BitSet(new long[]{0x204D7C044283C0C0L,0x00000007FFF7FFFCL,0x0000000000004220L});
    public static final BitSet FOLLOW_term_in_columnOperation5078 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_columnOperation5080 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_143_in_columnOperation5082 = new BitSet(new long[]{0x204D7C044283C0C0L,0x00000007FFF7FFFCL,0x0000000000004220L});
    public static final BitSet FOLLOW_term_in_columnOperation5086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_in_properties5112 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_K_AND_in_properties5116 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_property_in_properties5118 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_cident_in_property5141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_143_in_property5143 = new BitSet(new long[]{0x204D7C044283C0C0L,0x00000007FFF0FFFCL,0x0000000000004000L});
    public static final BitSet FOLLOW_propertyValue_in_property5148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_literal_in_property5177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_propertyValue5205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unreserved_keyword_in_propertyValue5227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_relationType5250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_relationType5261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_relationType5272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_148_in_relationType5282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_relationType5293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_relation5315 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000003C8000L});
    public static final BitSet FOLLOW_relationType_in_relation5319 = new BitSet(new long[]{0x204D7C044283C0C0L,0x00000007FFF7FFFCL,0x0000000000004220L});
    public static final BitSet FOLLOW_term_in_relation5323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TOKEN_in_relation5333 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_relation5356 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_cident_in_relation5360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_135_in_relation5366 = new BitSet(new long[]{0x20497C044281C0C0L,0x00000007FFF00FFCL});
    public static final BitSet FOLLOW_cident_in_relation5370 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_134_in_relation5376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000003C8000L});
    public static final BitSet FOLLOW_relationType_in_relation5388 = new BitSet(new long[]{0x204D7C044283C0C0L,0x00000007FFF7FFFCL,0x0000000000004220L});
    public static final BitSet FOLLOW_term_in_relation5392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_relation5412 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_K_IN_in_relation5414 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_relation5425 = new BitSet(new long[]{0x204D7C044283C0C0L,0x00000007FFF7FFFCL,0x0000000000004220L});
    public static final BitSet FOLLOW_term_in_relation5429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_135_in_relation5434 = new BitSet(new long[]{0x204D7C044283C0C0L,0x00000007FFF7FFFCL,0x0000000000004220L});
    public static final BitSet FOLLOW_term_in_relation5438 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_134_in_relation5445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_native_type_in_comparatorType5470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collection_type_in_comparatorType5486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_comparatorType5498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ASCII_in_native_type5527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_BIGINT_in_native_type5541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_BLOB_in_native_type5554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_BOOLEAN_in_native_type5569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_COUNTER_in_native_type5581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DECIMAL_in_native_type5593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DOUBLE_in_native_type5605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_FLOAT_in_native_type5618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_INET_in_native_type5632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_INT_in_native_type5647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TEXT_in_native_type5663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TIMESTAMP_in_native_type5678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_UUID_in_native_type5688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_VARCHAR_in_native_type5703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_VARINT_in_native_type5715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TIMEUUID_in_native_type5728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_MAP_in_collection_type5752 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_146_in_collection_type5755 = new BitSet(new long[]{0x204C7C044A804080L,0x00000007FFF007FCL});
    public static final BitSet FOLLOW_comparatorType_in_collection_type5759 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_collection_type5761 = new BitSet(new long[]{0x204C7C044A804080L,0x00000007FFF007FCL});
    public static final BitSet FOLLOW_comparatorType_in_collection_type5765 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_148_in_collection_type5767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_LIST_in_collection_type5785 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_146_in_collection_type5787 = new BitSet(new long[]{0x204C7C044A804080L,0x00000007FFF007FCL});
    public static final BitSet FOLLOW_comparatorType_in_collection_type5791 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_148_in_collection_type5793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_SET_in_collection_type5811 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_146_in_collection_type5814 = new BitSet(new long[]{0x204C7C044A804080L,0x00000007FFF007FCL});
    public static final BitSet FOLLOW_comparatorType_in_collection_type5818 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_148_in_collection_type5820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_username0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unreserved_function_keyword_in_unreserved_keyword5878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_unreserved_keyword5894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_unreserved_function_keyword5929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_native_type_in_unreserved_function_keyword6205 = new BitSet(new long[]{0x0000000000000002L});

}