package org.joclal.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.joclal.services.BrowserAutomationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBrowserAutomationParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'browser'", "';'", "'GoTo'", "'Click'", "'select('", "')'", "'Fill'", "'with'", "'Check'", "'Uncheck'", "'Let'", "'='", "'Do'", "'{'", "'}'", "'While'", "'('", "'If'", "'Then'", "'Else'", "'Def'", "','", "'Call'", "'Chrome'", "'Safari'", "'Opera'", "'Firefox'", "'Internet Explorer'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalBrowserAutomationParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBrowserAutomationParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBrowserAutomationParser.tokenNames; }
    public String getGrammarFileName() { return "../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g"; }



     	private BrowserAutomationGrammarAccess grammarAccess;
     	
        public InternalBrowserAutomationParser(TokenStream input, BrowserAutomationGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "BrowserAutomation";	
       	}
       	
       	@Override
       	protected BrowserAutomationGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleBrowserAutomation"
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:68:1: entryRuleBrowserAutomation returns [EObject current=null] : iv_ruleBrowserAutomation= ruleBrowserAutomation EOF ;
    public final EObject entryRuleBrowserAutomation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrowserAutomation = null;


        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:69:2: (iv_ruleBrowserAutomation= ruleBrowserAutomation EOF )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:70:2: iv_ruleBrowserAutomation= ruleBrowserAutomation EOF
            {
             newCompositeNode(grammarAccess.getBrowserAutomationRule()); 
            pushFollow(FOLLOW_ruleBrowserAutomation_in_entryRuleBrowserAutomation75);
            iv_ruleBrowserAutomation=ruleBrowserAutomation();

            state._fsp--;

             current =iv_ruleBrowserAutomation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBrowserAutomation85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBrowserAutomation"


    // $ANTLR start "ruleBrowserAutomation"
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:77:1: ruleBrowserAutomation returns [EObject current=null] : ( ( (lv_subroutines_0_0= ruleSubroutine ) )* otherlv_1= 'browser' ( (lv_browser_2_0= ruleBrowser ) ) otherlv_3= ';' ( (lv_firstGoTo_4_0= ruleGoto ) ) ( (lv_actions_5_0= ruleAction ) )* ) ;
    public final EObject ruleBrowserAutomation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_subroutines_0_0 = null;

        Enumerator lv_browser_2_0 = null;

        EObject lv_firstGoTo_4_0 = null;

        EObject lv_actions_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:80:28: ( ( ( (lv_subroutines_0_0= ruleSubroutine ) )* otherlv_1= 'browser' ( (lv_browser_2_0= ruleBrowser ) ) otherlv_3= ';' ( (lv_firstGoTo_4_0= ruleGoto ) ) ( (lv_actions_5_0= ruleAction ) )* ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:81:1: ( ( (lv_subroutines_0_0= ruleSubroutine ) )* otherlv_1= 'browser' ( (lv_browser_2_0= ruleBrowser ) ) otherlv_3= ';' ( (lv_firstGoTo_4_0= ruleGoto ) ) ( (lv_actions_5_0= ruleAction ) )* )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:81:1: ( ( (lv_subroutines_0_0= ruleSubroutine ) )* otherlv_1= 'browser' ( (lv_browser_2_0= ruleBrowser ) ) otherlv_3= ';' ( (lv_firstGoTo_4_0= ruleGoto ) ) ( (lv_actions_5_0= ruleAction ) )* )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:81:2: ( (lv_subroutines_0_0= ruleSubroutine ) )* otherlv_1= 'browser' ( (lv_browser_2_0= ruleBrowser ) ) otherlv_3= ';' ( (lv_firstGoTo_4_0= ruleGoto ) ) ( (lv_actions_5_0= ruleAction ) )*
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:81:2: ( (lv_subroutines_0_0= ruleSubroutine ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==31) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:82:1: (lv_subroutines_0_0= ruleSubroutine )
            	    {
            	    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:82:1: (lv_subroutines_0_0= ruleSubroutine )
            	    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:83:3: lv_subroutines_0_0= ruleSubroutine
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBrowserAutomationAccess().getSubroutinesSubroutineParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSubroutine_in_ruleBrowserAutomation131);
            	    lv_subroutines_0_0=ruleSubroutine();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBrowserAutomationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subroutines",
            	            		lv_subroutines_0_0, 
            	            		"Subroutine");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleBrowserAutomation144); 

                	newLeafNode(otherlv_1, grammarAccess.getBrowserAutomationAccess().getBrowserKeyword_1());
                
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:103:1: ( (lv_browser_2_0= ruleBrowser ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:104:1: (lv_browser_2_0= ruleBrowser )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:104:1: (lv_browser_2_0= ruleBrowser )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:105:3: lv_browser_2_0= ruleBrowser
            {
             
            	        newCompositeNode(grammarAccess.getBrowserAutomationAccess().getBrowserBrowserEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleBrowser_in_ruleBrowserAutomation165);
            lv_browser_2_0=ruleBrowser();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBrowserAutomationRule());
            	        }
                   		set(
                   			current, 
                   			"browser",
                    		lv_browser_2_0, 
                    		"Browser");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleBrowserAutomation177); 

                	newLeafNode(otherlv_3, grammarAccess.getBrowserAutomationAccess().getSemicolonKeyword_3());
                
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:125:1: ( (lv_firstGoTo_4_0= ruleGoto ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:126:1: (lv_firstGoTo_4_0= ruleGoto )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:126:1: (lv_firstGoTo_4_0= ruleGoto )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:127:3: lv_firstGoTo_4_0= ruleGoto
            {
             
            	        newCompositeNode(grammarAccess.getBrowserAutomationAccess().getFirstGoToGotoParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleGoto_in_ruleBrowserAutomation198);
            lv_firstGoTo_4_0=ruleGoto();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBrowserAutomationRule());
            	        }
                   		set(
                   			current, 
                   			"firstGoTo",
                    		lv_firstGoTo_4_0, 
                    		"Goto");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:143:2: ( (lv_actions_5_0= ruleAction ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=13 && LA2_0<=14)||LA2_0==17||(LA2_0>=19 && LA2_0<=21)||LA2_0==23||LA2_0==28||LA2_0==33) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:144:1: (lv_actions_5_0= ruleAction )
            	    {
            	    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:144:1: (lv_actions_5_0= ruleAction )
            	    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:145:3: lv_actions_5_0= ruleAction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBrowserAutomationAccess().getActionsActionParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAction_in_ruleBrowserAutomation219);
            	    lv_actions_5_0=ruleAction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBrowserAutomationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"actions",
            	            		lv_actions_5_0, 
            	            		"Action");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBrowserAutomation"


    // $ANTLR start "entryRuleAction"
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:169:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:170:2: (iv_ruleAction= ruleAction EOF )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:171:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction256);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction266); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:178:1: ruleAction returns [EObject current=null] : (this_Goto_0= ruleGoto | this_ClickOn_1= ruleClickOn | this_Fill_2= ruleFill | this_Check_3= ruleCheck | this_Uncheck_4= ruleUncheck | this_Let_5= ruleLet | this_DoWhile_6= ruleDoWhile | this_IfThen_7= ruleIfThen | this_SubroutineCall_8= ruleSubroutineCall ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_Goto_0 = null;

        EObject this_ClickOn_1 = null;

        EObject this_Fill_2 = null;

        EObject this_Check_3 = null;

        EObject this_Uncheck_4 = null;

        EObject this_Let_5 = null;

        EObject this_DoWhile_6 = null;

        EObject this_IfThen_7 = null;

        EObject this_SubroutineCall_8 = null;


         enterRule(); 
            
        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:181:28: ( (this_Goto_0= ruleGoto | this_ClickOn_1= ruleClickOn | this_Fill_2= ruleFill | this_Check_3= ruleCheck | this_Uncheck_4= ruleUncheck | this_Let_5= ruleLet | this_DoWhile_6= ruleDoWhile | this_IfThen_7= ruleIfThen | this_SubroutineCall_8= ruleSubroutineCall ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:182:1: (this_Goto_0= ruleGoto | this_ClickOn_1= ruleClickOn | this_Fill_2= ruleFill | this_Check_3= ruleCheck | this_Uncheck_4= ruleUncheck | this_Let_5= ruleLet | this_DoWhile_6= ruleDoWhile | this_IfThen_7= ruleIfThen | this_SubroutineCall_8= ruleSubroutineCall )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:182:1: (this_Goto_0= ruleGoto | this_ClickOn_1= ruleClickOn | this_Fill_2= ruleFill | this_Check_3= ruleCheck | this_Uncheck_4= ruleUncheck | this_Let_5= ruleLet | this_DoWhile_6= ruleDoWhile | this_IfThen_7= ruleIfThen | this_SubroutineCall_8= ruleSubroutineCall )
            int alt3=9;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            case 19:
                {
                alt3=4;
                }
                break;
            case 20:
                {
                alt3=5;
                }
                break;
            case 21:
                {
                alt3=6;
                }
                break;
            case 23:
                {
                alt3=7;
                }
                break;
            case 28:
                {
                alt3=8;
                }
                break;
            case 33:
                {
                alt3=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:183:5: this_Goto_0= ruleGoto
                    {
                     
                            newCompositeNode(grammarAccess.getActionAccess().getGotoParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleGoto_in_ruleAction313);
                    this_Goto_0=ruleGoto();

                    state._fsp--;

                     
                            current = this_Goto_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:193:5: this_ClickOn_1= ruleClickOn
                    {
                     
                            newCompositeNode(grammarAccess.getActionAccess().getClickOnParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleClickOn_in_ruleAction340);
                    this_ClickOn_1=ruleClickOn();

                    state._fsp--;

                     
                            current = this_ClickOn_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:203:5: this_Fill_2= ruleFill
                    {
                     
                            newCompositeNode(grammarAccess.getActionAccess().getFillParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFill_in_ruleAction367);
                    this_Fill_2=ruleFill();

                    state._fsp--;

                     
                            current = this_Fill_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:213:5: this_Check_3= ruleCheck
                    {
                     
                            newCompositeNode(grammarAccess.getActionAccess().getCheckParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleCheck_in_ruleAction394);
                    this_Check_3=ruleCheck();

                    state._fsp--;

                     
                            current = this_Check_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:223:5: this_Uncheck_4= ruleUncheck
                    {
                     
                            newCompositeNode(grammarAccess.getActionAccess().getUncheckParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleUncheck_in_ruleAction421);
                    this_Uncheck_4=ruleUncheck();

                    state._fsp--;

                     
                            current = this_Uncheck_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:233:5: this_Let_5= ruleLet
                    {
                     
                            newCompositeNode(grammarAccess.getActionAccess().getLetParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleLet_in_ruleAction448);
                    this_Let_5=ruleLet();

                    state._fsp--;

                     
                            current = this_Let_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:243:5: this_DoWhile_6= ruleDoWhile
                    {
                     
                            newCompositeNode(grammarAccess.getActionAccess().getDoWhileParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleDoWhile_in_ruleAction475);
                    this_DoWhile_6=ruleDoWhile();

                    state._fsp--;

                     
                            current = this_DoWhile_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:253:5: this_IfThen_7= ruleIfThen
                    {
                     
                            newCompositeNode(grammarAccess.getActionAccess().getIfThenParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleIfThen_in_ruleAction502);
                    this_IfThen_7=ruleIfThen();

                    state._fsp--;

                     
                            current = this_IfThen_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:263:5: this_SubroutineCall_8= ruleSubroutineCall
                    {
                     
                            newCompositeNode(grammarAccess.getActionAccess().getSubroutineCallParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleSubroutineCall_in_ruleAction529);
                    this_SubroutineCall_8=ruleSubroutineCall();

                    state._fsp--;

                     
                            current = this_SubroutineCall_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleGoto"
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:279:1: entryRuleGoto returns [EObject current=null] : iv_ruleGoto= ruleGoto EOF ;
    public final EObject entryRuleGoto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoto = null;


        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:280:2: (iv_ruleGoto= ruleGoto EOF )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:281:2: iv_ruleGoto= ruleGoto EOF
            {
             newCompositeNode(grammarAccess.getGotoRule()); 
            pushFollow(FOLLOW_ruleGoto_in_entryRuleGoto564);
            iv_ruleGoto=ruleGoto();

            state._fsp--;

             current =iv_ruleGoto; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoto574); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGoto"


    // $ANTLR start "ruleGoto"
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:288:1: ruleGoto returns [EObject current=null] : (otherlv_0= 'GoTo' ( (lv_url_1_0= ruleValue ) ) otherlv_2= ';' ) ;
    public final EObject ruleGoto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_url_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:291:28: ( (otherlv_0= 'GoTo' ( (lv_url_1_0= ruleValue ) ) otherlv_2= ';' ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:292:1: (otherlv_0= 'GoTo' ( (lv_url_1_0= ruleValue ) ) otherlv_2= ';' )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:292:1: (otherlv_0= 'GoTo' ( (lv_url_1_0= ruleValue ) ) otherlv_2= ';' )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:292:3: otherlv_0= 'GoTo' ( (lv_url_1_0= ruleValue ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleGoto611); 

                	newLeafNode(otherlv_0, grammarAccess.getGotoAccess().getGoToKeyword_0());
                
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:296:1: ( (lv_url_1_0= ruleValue ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:297:1: (lv_url_1_0= ruleValue )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:297:1: (lv_url_1_0= ruleValue )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:298:3: lv_url_1_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getGotoAccess().getUrlValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleGoto632);
            lv_url_1_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGotoRule());
            	        }
                   		set(
                   			current, 
                   			"url",
                    		lv_url_1_0, 
                    		"Value");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleGoto644); 

                	newLeafNode(otherlv_2, grammarAccess.getGotoAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGoto"


    // $ANTLR start "entryRuleClickOn"
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:326:1: entryRuleClickOn returns [EObject current=null] : iv_ruleClickOn= ruleClickOn EOF ;
    public final EObject entryRuleClickOn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClickOn = null;


        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:327:2: (iv_ruleClickOn= ruleClickOn EOF )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:328:2: iv_ruleClickOn= ruleClickOn EOF
            {
             newCompositeNode(grammarAccess.getClickOnRule()); 
            pushFollow(FOLLOW_ruleClickOn_in_entryRuleClickOn680);
            iv_ruleClickOn=ruleClickOn();

            state._fsp--;

             current =iv_ruleClickOn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClickOn690); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClickOn"


    // $ANTLR start "ruleClickOn"
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:335:1: ruleClickOn returns [EObject current=null] : (otherlv_0= 'Click' ( (lv_selector_1_0= ruleSelector ) ) otherlv_2= ';' ) ;
    public final EObject ruleClickOn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_selector_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:338:28: ( (otherlv_0= 'Click' ( (lv_selector_1_0= ruleSelector ) ) otherlv_2= ';' ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:339:1: (otherlv_0= 'Click' ( (lv_selector_1_0= ruleSelector ) ) otherlv_2= ';' )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:339:1: (otherlv_0= 'Click' ( (lv_selector_1_0= ruleSelector ) ) otherlv_2= ';' )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:339:3: otherlv_0= 'Click' ( (lv_selector_1_0= ruleSelector ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleClickOn727); 

                	newLeafNode(otherlv_0, grammarAccess.getClickOnAccess().getClickKeyword_0());
                
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:343:1: ( (lv_selector_1_0= ruleSelector ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:344:1: (lv_selector_1_0= ruleSelector )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:344:1: (lv_selector_1_0= ruleSelector )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:345:3: lv_selector_1_0= ruleSelector
            {
             
            	        newCompositeNode(grammarAccess.getClickOnAccess().getSelectorSelectorParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSelector_in_ruleClickOn748);
            lv_selector_1_0=ruleSelector();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClickOnRule());
            	        }
                   		set(
                   			current, 
                   			"selector",
                    		lv_selector_1_0, 
                    		"Selector");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleClickOn760); 

                	newLeafNode(otherlv_2, grammarAccess.getClickOnAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClickOn"


    // $ANTLR start "entryRuleSelector"
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:373:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:374:2: (iv_ruleSelector= ruleSelector EOF )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:375:2: iv_ruleSelector= ruleSelector EOF
            {
             newCompositeNode(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_ruleSelector_in_entryRuleSelector796);
            iv_ruleSelector=ruleSelector();

            state._fsp--;

             current =iv_ruleSelector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelector806); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelector"


    // $ANTLR start "ruleSelector"
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:382:1: ruleSelector returns [EObject current=null] : (otherlv_0= 'select(' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ')' ) ;
    public final EObject ruleSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:385:28: ( (otherlv_0= 'select(' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ')' ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:386:1: (otherlv_0= 'select(' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ')' )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:386:1: (otherlv_0= 'select(' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ')' )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:386:3: otherlv_0= 'select(' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSelector843); 

                	newLeafNode(otherlv_0, grammarAccess.getSelectorAccess().getSelectKeyword_0());
                
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:390:1: ( (lv_id_1_0= RULE_STRING ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:391:1: (lv_id_1_0= RULE_STRING )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:391:1: (lv_id_1_0= RULE_STRING )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:392:3: lv_id_1_0= RULE_STRING
            {
            lv_id_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSelector860); 

            			newLeafNode(lv_id_1_0, grammarAccess.getSelectorAccess().getIdSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSelectorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleSelector877); 

                	newLeafNode(otherlv_2, grammarAccess.getSelectorAccess().getRightParenthesisKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleFill"
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:420:1: entryRuleFill returns [EObject current=null] : iv_ruleFill= ruleFill EOF ;
    public final EObject entryRuleFill() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFill = null;


        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:421:2: (iv_ruleFill= ruleFill EOF )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:422:2: iv_ruleFill= ruleFill EOF
            {
             newCompositeNode(grammarAccess.getFillRule()); 
            pushFollow(FOLLOW_ruleFill_in_entryRuleFill913);
            iv_ruleFill=ruleFill();

            state._fsp--;

             current =iv_ruleFill; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFill923); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFill"


    // $ANTLR start "ruleFill"
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:429:1: ruleFill returns [EObject current=null] : (otherlv_0= 'Fill' ( (lv_field_1_0= ruleSelector ) ) otherlv_2= 'with' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ';' ) ;
    public final EObject ruleFill() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_field_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:432:28: ( (otherlv_0= 'Fill' ( (lv_field_1_0= ruleSelector ) ) otherlv_2= 'with' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ';' ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:433:1: (otherlv_0= 'Fill' ( (lv_field_1_0= ruleSelector ) ) otherlv_2= 'with' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ';' )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:433:1: (otherlv_0= 'Fill' ( (lv_field_1_0= ruleSelector ) ) otherlv_2= 'with' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ';' )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:433:3: otherlv_0= 'Fill' ( (lv_field_1_0= ruleSelector ) ) otherlv_2= 'with' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleFill960); 

                	newLeafNode(otherlv_0, grammarAccess.getFillAccess().getFillKeyword_0());
                
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:437:1: ( (lv_field_1_0= ruleSelector ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:438:1: (lv_field_1_0= ruleSelector )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:438:1: (lv_field_1_0= ruleSelector )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:439:3: lv_field_1_0= ruleSelector
            {
             
            	        newCompositeNode(grammarAccess.getFillAccess().getFieldSelectorParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSelector_in_ruleFill981);
            lv_field_1_0=ruleSelector();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFillRule());
            	        }
                   		set(
                   			current, 
                   			"field",
                    		lv_field_1_0, 
                    		"Selector");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleFill993); 

                	newLeafNode(otherlv_2, grammarAccess.getFillAccess().getWithKeyword_2());
                
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:459:1: ( (lv_value_3_0= ruleValue ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:460:1: (lv_value_3_0= ruleValue )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:460:1: (lv_value_3_0= ruleValue )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:461:3: lv_value_3_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getFillAccess().getValueValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleFill1014);
            lv_value_3_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFillRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"Value");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleFill1026); 

                	newLeafNode(otherlv_4, grammarAccess.getFillAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFill"


    // $ANTLR start "entryRuleCheck"
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:489:1: entryRuleCheck returns [EObject current=null] : iv_ruleCheck= ruleCheck EOF ;
    public final EObject entryRuleCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheck = null;


        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:490:2: (iv_ruleCheck= ruleCheck EOF )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:491:2: iv_ruleCheck= ruleCheck EOF
            {
             newCompositeNode(grammarAccess.getCheckRule()); 
            pushFollow(FOLLOW_ruleCheck_in_entryRuleCheck1062);
            iv_ruleCheck=ruleCheck();

            state._fsp--;

             current =iv_ruleCheck; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheck1072); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCheck"


    // $ANTLR start "ruleCheck"
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:498:1: ruleCheck returns [EObject current=null] : (otherlv_0= 'Check' ( (lv_checkbox_1_0= ruleSelector ) ) otherlv_2= ';' ) ;
    public final EObject ruleCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_checkbox_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:501:28: ( (otherlv_0= 'Check' ( (lv_checkbox_1_0= ruleSelector ) ) otherlv_2= ';' ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:502:1: (otherlv_0= 'Check' ( (lv_checkbox_1_0= ruleSelector ) ) otherlv_2= ';' )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:502:1: (otherlv_0= 'Check' ( (lv_checkbox_1_0= ruleSelector ) ) otherlv_2= ';' )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:502:3: otherlv_0= 'Check' ( (lv_checkbox_1_0= ruleSelector ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleCheck1109); 

                	newLeafNode(otherlv_0, grammarAccess.getCheckAccess().getCheckKeyword_0());
                
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:506:1: ( (lv_checkbox_1_0= ruleSelector ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:507:1: (lv_checkbox_1_0= ruleSelector )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:507:1: (lv_checkbox_1_0= ruleSelector )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:508:3: lv_checkbox_1_0= ruleSelector
            {
             
            	        newCompositeNode(grammarAccess.getCheckAccess().getCheckboxSelectorParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSelector_in_ruleCheck1130);
            lv_checkbox_1_0=ruleSelector();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCheckRule());
            	        }
                   		set(
                   			current, 
                   			"checkbox",
                    		lv_checkbox_1_0, 
                    		"Selector");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleCheck1142); 

                	newLeafNode(otherlv_2, grammarAccess.getCheckAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCheck"


    // $ANTLR start "entryRuleUncheck"
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:536:1: entryRuleUncheck returns [EObject current=null] : iv_ruleUncheck= ruleUncheck EOF ;
    public final EObject entryRuleUncheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUncheck = null;


        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:537:2: (iv_ruleUncheck= ruleUncheck EOF )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:538:2: iv_ruleUncheck= ruleUncheck EOF
            {
             newCompositeNode(grammarAccess.getUncheckRule()); 
            pushFollow(FOLLOW_ruleUncheck_in_entryRuleUncheck1178);
            iv_ruleUncheck=ruleUncheck();

            state._fsp--;

             current =iv_ruleUncheck; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUncheck1188); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUncheck"


    // $ANTLR start "ruleUncheck"
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:545:1: ruleUncheck returns [EObject current=null] : (otherlv_0= 'Uncheck' ( (lv_checkbox_1_0= ruleSelector ) ) otherlv_2= ';' ) ;
    public final EObject ruleUncheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_checkbox_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:548:28: ( (otherlv_0= 'Uncheck' ( (lv_checkbox_1_0= ruleSelector ) ) otherlv_2= ';' ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:549:1: (otherlv_0= 'Uncheck' ( (lv_checkbox_1_0= ruleSelector ) ) otherlv_2= ';' )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:549:1: (otherlv_0= 'Uncheck' ( (lv_checkbox_1_0= ruleSelector ) ) otherlv_2= ';' )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:549:3: otherlv_0= 'Uncheck' ( (lv_checkbox_1_0= ruleSelector ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleUncheck1225); 

                	newLeafNode(otherlv_0, grammarAccess.getUncheckAccess().getUncheckKeyword_0());
                
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:553:1: ( (lv_checkbox_1_0= ruleSelector ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:554:1: (lv_checkbox_1_0= ruleSelector )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:554:1: (lv_checkbox_1_0= ruleSelector )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:555:3: lv_checkbox_1_0= ruleSelector
            {
             
            	        newCompositeNode(grammarAccess.getUncheckAccess().getCheckboxSelectorParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSelector_in_ruleUncheck1246);
            lv_checkbox_1_0=ruleSelector();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUncheckRule());
            	        }
                   		set(
                   			current, 
                   			"checkbox",
                    		lv_checkbox_1_0, 
                    		"Selector");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleUncheck1258); 

                	newLeafNode(otherlv_2, grammarAccess.getUncheckAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUncheck"


    // $ANTLR start "entryRuleLet"
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:583:1: entryRuleLet returns [EObject current=null] : iv_ruleLet= ruleLet EOF ;
    public final EObject entryRuleLet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLet = null;


        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:584:2: (iv_ruleLet= ruleLet EOF )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:585:2: iv_ruleLet= ruleLet EOF
            {
             newCompositeNode(grammarAccess.getLetRule()); 
            pushFollow(FOLLOW_ruleLet_in_entryRuleLet1294);
            iv_ruleLet=ruleLet();

            state._fsp--;

             current =iv_ruleLet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLet1304); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLet"


    // $ANTLR start "ruleLet"
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:592:1: ruleLet returns [EObject current=null] : (otherlv_0= 'Let' ( (lv_id_1_0= ruleVariableId ) ) otherlv_2= '=' ( (lv_value_3_0= ruleLetValue ) ) otherlv_4= ';' ) ;
    public final EObject ruleLet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_id_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:595:28: ( (otherlv_0= 'Let' ( (lv_id_1_0= ruleVariableId ) ) otherlv_2= '=' ( (lv_value_3_0= ruleLetValue ) ) otherlv_4= ';' ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:596:1: (otherlv_0= 'Let' ( (lv_id_1_0= ruleVariableId ) ) otherlv_2= '=' ( (lv_value_3_0= ruleLetValue ) ) otherlv_4= ';' )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:596:1: (otherlv_0= 'Let' ( (lv_id_1_0= ruleVariableId ) ) otherlv_2= '=' ( (lv_value_3_0= ruleLetValue ) ) otherlv_4= ';' )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:596:3: otherlv_0= 'Let' ( (lv_id_1_0= ruleVariableId ) ) otherlv_2= '=' ( (lv_value_3_0= ruleLetValue ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleLet1341); 

                	newLeafNode(otherlv_0, grammarAccess.getLetAccess().getLetKeyword_0());
                
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:600:1: ( (lv_id_1_0= ruleVariableId ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:601:1: (lv_id_1_0= ruleVariableId )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:601:1: (lv_id_1_0= ruleVariableId )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:602:3: lv_id_1_0= ruleVariableId
            {
             
            	        newCompositeNode(grammarAccess.getLetAccess().getIdVariableIdParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVariableId_in_ruleLet1362);
            lv_id_1_0=ruleVariableId();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLetRule());
            	        }
                   		set(
                   			current, 
                   			"id",
                    		lv_id_1_0, 
                    		"VariableId");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleLet1374); 

                	newLeafNode(otherlv_2, grammarAccess.getLetAccess().getEqualsSignKeyword_2());
                
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:622:1: ( (lv_value_3_0= ruleLetValue ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:623:1: (lv_value_3_0= ruleLetValue )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:623:1: (lv_value_3_0= ruleLetValue )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:624:3: lv_value_3_0= ruleLetValue
            {
             
            	        newCompositeNode(grammarAccess.getLetAccess().getValueLetValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleLetValue_in_ruleLet1395);
            lv_value_3_0=ruleLetValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLetRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"LetValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleLet1407); 

                	newLeafNode(otherlv_4, grammarAccess.getLetAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLet"


    // $ANTLR start "entryRuleLetValue"
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:652:1: entryRuleLetValue returns [EObject current=null] : iv_ruleLetValue= ruleLetValue EOF ;
    public final EObject entryRuleLetValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetValue = null;


        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:653:2: (iv_ruleLetValue= ruleLetValue EOF )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:654:2: iv_ruleLetValue= ruleLetValue EOF
            {
             newCompositeNode(grammarAccess.getLetValueRule()); 
            pushFollow(FOLLOW_ruleLetValue_in_entryRuleLetValue1443);
            iv_ruleLetValue=ruleLetValue();

            state._fsp--;

             current =iv_ruleLetValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLetValue1453); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLetValue"


    // $ANTLR start "ruleLetValue"
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:661:1: ruleLetValue returns [EObject current=null] : ( ( (lv_selector_0_0= ruleSelector ) ) | ( (lv_value_1_0= ruleValue ) ) ) ;
    public final EObject ruleLetValue() throws RecognitionException {
        EObject current = null;

        EObject lv_selector_0_0 = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:664:28: ( ( ( (lv_selector_0_0= ruleSelector ) ) | ( (lv_value_1_0= ruleValue ) ) ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:665:1: ( ( (lv_selector_0_0= ruleSelector ) ) | ( (lv_value_1_0= ruleValue ) ) )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:665:1: ( ( (lv_selector_0_0= ruleSelector ) ) | ( (lv_value_1_0= ruleValue ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:665:2: ( (lv_selector_0_0= ruleSelector ) )
                    {
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:665:2: ( (lv_selector_0_0= ruleSelector ) )
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:666:1: (lv_selector_0_0= ruleSelector )
                    {
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:666:1: (lv_selector_0_0= ruleSelector )
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:667:3: lv_selector_0_0= ruleSelector
                    {
                     
                    	        newCompositeNode(grammarAccess.getLetValueAccess().getSelectorSelectorParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSelector_in_ruleLetValue1499);
                    lv_selector_0_0=ruleSelector();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLetValueRule());
                    	        }
                           		set(
                           			current, 
                           			"selector",
                            		lv_selector_0_0, 
                            		"Selector");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:684:6: ( (lv_value_1_0= ruleValue ) )
                    {
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:684:6: ( (lv_value_1_0= ruleValue ) )
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:685:1: (lv_value_1_0= ruleValue )
                    {
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:685:1: (lv_value_1_0= ruleValue )
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:686:3: lv_value_1_0= ruleValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getLetValueAccess().getValueValueParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValue_in_ruleLetValue1526);
                    lv_value_1_0=ruleValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLetValueRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_1_0, 
                            		"Value");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLetValue"


    // $ANTLR start "entryRuleValue"
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:710:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:711:2: (iv_ruleValue= ruleValue EOF )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:712:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue1562);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue1572); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:719:1: ruleValue returns [EObject current=null] : ( ( (lv_string_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token lv_string_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:722:28: ( ( ( (lv_string_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:723:1: ( ( (lv_string_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:723:1: ( ( (lv_string_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:723:2: ( (lv_string_0_0= RULE_STRING ) )
                    {
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:723:2: ( (lv_string_0_0= RULE_STRING ) )
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:724:1: (lv_string_0_0= RULE_STRING )
                    {
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:724:1: (lv_string_0_0= RULE_STRING )
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:725:3: lv_string_0_0= RULE_STRING
                    {
                    lv_string_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValue1614); 

                    			newLeafNode(lv_string_0_0, grammarAccess.getValueAccess().getStringSTRINGTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"string",
                            		lv_string_0_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:742:6: ( (otherlv_1= RULE_ID ) )
                    {
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:742:6: ( (otherlv_1= RULE_ID ) )
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:743:1: (otherlv_1= RULE_ID )
                    {
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:743:1: (otherlv_1= RULE_ID )
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:744:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getValueRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValue1645); 

                    		newLeafNode(otherlv_1, grammarAccess.getValueAccess().getVariableVariableIdCrossReference_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleDoWhile"
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:763:1: entryRuleDoWhile returns [EObject current=null] : iv_ruleDoWhile= ruleDoWhile EOF ;
    public final EObject entryRuleDoWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoWhile = null;


        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:764:2: (iv_ruleDoWhile= ruleDoWhile EOF )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:765:2: iv_ruleDoWhile= ruleDoWhile EOF
            {
             newCompositeNode(grammarAccess.getDoWhileRule()); 
            pushFollow(FOLLOW_ruleDoWhile_in_entryRuleDoWhile1681);
            iv_ruleDoWhile=ruleDoWhile();

            state._fsp--;

             current =iv_ruleDoWhile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoWhile1691); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDoWhile"


    // $ANTLR start "ruleDoWhile"
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:772:1: ruleDoWhile returns [EObject current=null] : (otherlv_0= 'Do' otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) )* otherlv_3= '}' otherlv_4= 'While' otherlv_5= '(' ( (lv_condition_6_0= ruleBooleanExp ) ) otherlv_7= ')' ) ;
    public final EObject ruleDoWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_actions_2_0 = null;

        EObject lv_condition_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:775:28: ( (otherlv_0= 'Do' otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) )* otherlv_3= '}' otherlv_4= 'While' otherlv_5= '(' ( (lv_condition_6_0= ruleBooleanExp ) ) otherlv_7= ')' ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:776:1: (otherlv_0= 'Do' otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) )* otherlv_3= '}' otherlv_4= 'While' otherlv_5= '(' ( (lv_condition_6_0= ruleBooleanExp ) ) otherlv_7= ')' )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:776:1: (otherlv_0= 'Do' otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) )* otherlv_3= '}' otherlv_4= 'While' otherlv_5= '(' ( (lv_condition_6_0= ruleBooleanExp ) ) otherlv_7= ')' )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:776:3: otherlv_0= 'Do' otherlv_1= '{' ( (lv_actions_2_0= ruleAction ) )* otherlv_3= '}' otherlv_4= 'While' otherlv_5= '(' ( (lv_condition_6_0= ruleBooleanExp ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleDoWhile1728); 

                	newLeafNode(otherlv_0, grammarAccess.getDoWhileAccess().getDoKeyword_0());
                
            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleDoWhile1740); 

                	newLeafNode(otherlv_1, grammarAccess.getDoWhileAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:784:1: ( (lv_actions_2_0= ruleAction ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=13 && LA6_0<=14)||LA6_0==17||(LA6_0>=19 && LA6_0<=21)||LA6_0==23||LA6_0==28||LA6_0==33) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:785:1: (lv_actions_2_0= ruleAction )
            	    {
            	    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:785:1: (lv_actions_2_0= ruleAction )
            	    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:786:3: lv_actions_2_0= ruleAction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDoWhileAccess().getActionsActionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAction_in_ruleDoWhile1761);
            	    lv_actions_2_0=ruleAction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDoWhileRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"actions",
            	            		lv_actions_2_0, 
            	            		"Action");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleDoWhile1774); 

                	newLeafNode(otherlv_3, grammarAccess.getDoWhileAccess().getRightCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleDoWhile1786); 

                	newLeafNode(otherlv_4, grammarAccess.getDoWhileAccess().getWhileKeyword_4());
                
            otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleDoWhile1798); 

                	newLeafNode(otherlv_5, grammarAccess.getDoWhileAccess().getLeftParenthesisKeyword_5());
                
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:814:1: ( (lv_condition_6_0= ruleBooleanExp ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:815:1: (lv_condition_6_0= ruleBooleanExp )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:815:1: (lv_condition_6_0= ruleBooleanExp )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:816:3: lv_condition_6_0= ruleBooleanExp
            {
             
            	        newCompositeNode(grammarAccess.getDoWhileAccess().getConditionBooleanExpParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleBooleanExp_in_ruleDoWhile1819);
            lv_condition_6_0=ruleBooleanExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDoWhileRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_6_0, 
                    		"BooleanExp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleDoWhile1831); 

                	newLeafNode(otherlv_7, grammarAccess.getDoWhileAccess().getRightParenthesisKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDoWhile"


    // $ANTLR start "entryRuleBooleanExp"
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:844:1: entryRuleBooleanExp returns [EObject current=null] : iv_ruleBooleanExp= ruleBooleanExp EOF ;
    public final EObject entryRuleBooleanExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExp = null;


        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:845:2: (iv_ruleBooleanExp= ruleBooleanExp EOF )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:846:2: iv_ruleBooleanExp= ruleBooleanExp EOF
            {
             newCompositeNode(grammarAccess.getBooleanExpRule()); 
            pushFollow(FOLLOW_ruleBooleanExp_in_entryRuleBooleanExp1867);
            iv_ruleBooleanExp=ruleBooleanExp();

            state._fsp--;

             current =iv_ruleBooleanExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanExp1877); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanExp"


    // $ANTLR start "ruleBooleanExp"
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:853:1: ruleBooleanExp returns [EObject current=null] : ( ( (lv_leftMember_0_0= ruleValue ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_rightMember_2_0= ruleValue ) ) ) ;
    public final EObject ruleBooleanExp() throws RecognitionException {
        EObject current = null;

        EObject lv_leftMember_0_0 = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_rightMember_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:856:28: ( ( ( (lv_leftMember_0_0= ruleValue ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_rightMember_2_0= ruleValue ) ) ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:857:1: ( ( (lv_leftMember_0_0= ruleValue ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_rightMember_2_0= ruleValue ) ) )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:857:1: ( ( (lv_leftMember_0_0= ruleValue ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_rightMember_2_0= ruleValue ) ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:857:2: ( (lv_leftMember_0_0= ruleValue ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_rightMember_2_0= ruleValue ) )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:857:2: ( (lv_leftMember_0_0= ruleValue ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:858:1: (lv_leftMember_0_0= ruleValue )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:858:1: (lv_leftMember_0_0= ruleValue )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:859:3: lv_leftMember_0_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getBooleanExpAccess().getLeftMemberValueParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleBooleanExp1923);
            lv_leftMember_0_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBooleanExpRule());
            	        }
                   		set(
                   			current, 
                   			"leftMember",
                    		lv_leftMember_0_0, 
                    		"Value");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:875:2: ( (lv_operator_1_0= ruleOperator ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:876:1: (lv_operator_1_0= ruleOperator )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:876:1: (lv_operator_1_0= ruleOperator )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:877:3: lv_operator_1_0= ruleOperator
            {
             
            	        newCompositeNode(grammarAccess.getBooleanExpAccess().getOperatorOperatorEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleOperator_in_ruleBooleanExp1944);
            lv_operator_1_0=ruleOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBooleanExpRule());
            	        }
                   		set(
                   			current, 
                   			"operator",
                    		lv_operator_1_0, 
                    		"Operator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:893:2: ( (lv_rightMember_2_0= ruleValue ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:894:1: (lv_rightMember_2_0= ruleValue )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:894:1: (lv_rightMember_2_0= ruleValue )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:895:3: lv_rightMember_2_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getBooleanExpAccess().getRightMemberValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleBooleanExp1965);
            lv_rightMember_2_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBooleanExpRule());
            	        }
                   		set(
                   			current, 
                   			"rightMember",
                    		lv_rightMember_2_0, 
                    		"Value");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanExp"


    // $ANTLR start "entryRuleIfThen"
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:919:1: entryRuleIfThen returns [EObject current=null] : iv_ruleIfThen= ruleIfThen EOF ;
    public final EObject entryRuleIfThen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfThen = null;


        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:920:2: (iv_ruleIfThen= ruleIfThen EOF )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:921:2: iv_ruleIfThen= ruleIfThen EOF
            {
             newCompositeNode(grammarAccess.getIfThenRule()); 
            pushFollow(FOLLOW_ruleIfThen_in_entryRuleIfThen2001);
            iv_ruleIfThen=ruleIfThen();

            state._fsp--;

             current =iv_ruleIfThen; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfThen2011); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfThen"


    // $ANTLR start "ruleIfThen"
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:928:1: ruleIfThen returns [EObject current=null] : (otherlv_0= 'If' otherlv_1= '(' ( (lv_condition_2_0= ruleBooleanExp ) ) otherlv_3= ')' otherlv_4= 'Then' otherlv_5= '{' ( (lv_thenActions_6_0= ruleAction ) )* otherlv_7= '}' (otherlv_8= 'Else' otherlv_9= '{' ( (lv_elseActions_10_0= ruleAction ) )* otherlv_11= '}' )? ) ;
    public final EObject ruleIfThen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_condition_2_0 = null;

        EObject lv_thenActions_6_0 = null;

        EObject lv_elseActions_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:931:28: ( (otherlv_0= 'If' otherlv_1= '(' ( (lv_condition_2_0= ruleBooleanExp ) ) otherlv_3= ')' otherlv_4= 'Then' otherlv_5= '{' ( (lv_thenActions_6_0= ruleAction ) )* otherlv_7= '}' (otherlv_8= 'Else' otherlv_9= '{' ( (lv_elseActions_10_0= ruleAction ) )* otherlv_11= '}' )? ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:932:1: (otherlv_0= 'If' otherlv_1= '(' ( (lv_condition_2_0= ruleBooleanExp ) ) otherlv_3= ')' otherlv_4= 'Then' otherlv_5= '{' ( (lv_thenActions_6_0= ruleAction ) )* otherlv_7= '}' (otherlv_8= 'Else' otherlv_9= '{' ( (lv_elseActions_10_0= ruleAction ) )* otherlv_11= '}' )? )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:932:1: (otherlv_0= 'If' otherlv_1= '(' ( (lv_condition_2_0= ruleBooleanExp ) ) otherlv_3= ')' otherlv_4= 'Then' otherlv_5= '{' ( (lv_thenActions_6_0= ruleAction ) )* otherlv_7= '}' (otherlv_8= 'Else' otherlv_9= '{' ( (lv_elseActions_10_0= ruleAction ) )* otherlv_11= '}' )? )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:932:3: otherlv_0= 'If' otherlv_1= '(' ( (lv_condition_2_0= ruleBooleanExp ) ) otherlv_3= ')' otherlv_4= 'Then' otherlv_5= '{' ( (lv_thenActions_6_0= ruleAction ) )* otherlv_7= '}' (otherlv_8= 'Else' otherlv_9= '{' ( (lv_elseActions_10_0= ruleAction ) )* otherlv_11= '}' )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleIfThen2048); 

                	newLeafNode(otherlv_0, grammarAccess.getIfThenAccess().getIfKeyword_0());
                
            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleIfThen2060); 

                	newLeafNode(otherlv_1, grammarAccess.getIfThenAccess().getLeftParenthesisKeyword_1());
                
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:940:1: ( (lv_condition_2_0= ruleBooleanExp ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:941:1: (lv_condition_2_0= ruleBooleanExp )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:941:1: (lv_condition_2_0= ruleBooleanExp )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:942:3: lv_condition_2_0= ruleBooleanExp
            {
             
            	        newCompositeNode(grammarAccess.getIfThenAccess().getConditionBooleanExpParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleBooleanExp_in_ruleIfThen2081);
            lv_condition_2_0=ruleBooleanExp();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIfThenRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_2_0, 
                    		"BooleanExp");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleIfThen2093); 

                	newLeafNode(otherlv_3, grammarAccess.getIfThenAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleIfThen2105); 

                	newLeafNode(otherlv_4, grammarAccess.getIfThenAccess().getThenKeyword_4());
                
            otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleIfThen2117); 

                	newLeafNode(otherlv_5, grammarAccess.getIfThenAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:970:1: ( (lv_thenActions_6_0= ruleAction ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=13 && LA7_0<=14)||LA7_0==17||(LA7_0>=19 && LA7_0<=21)||LA7_0==23||LA7_0==28||LA7_0==33) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:971:1: (lv_thenActions_6_0= ruleAction )
            	    {
            	    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:971:1: (lv_thenActions_6_0= ruleAction )
            	    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:972:3: lv_thenActions_6_0= ruleAction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIfThenAccess().getThenActionsActionParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAction_in_ruleIfThen2138);
            	    lv_thenActions_6_0=ruleAction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIfThenRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"thenActions",
            	            		lv_thenActions_6_0, 
            	            		"Action");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleIfThen2151); 

                	newLeafNode(otherlv_7, grammarAccess.getIfThenAccess().getRightCurlyBracketKeyword_7());
                
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:992:1: (otherlv_8= 'Else' otherlv_9= '{' ( (lv_elseActions_10_0= ruleAction ) )* otherlv_11= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:992:3: otherlv_8= 'Else' otherlv_9= '{' ( (lv_elseActions_10_0= ruleAction ) )* otherlv_11= '}'
                    {
                    otherlv_8=(Token)match(input,30,FOLLOW_30_in_ruleIfThen2164); 

                        	newLeafNode(otherlv_8, grammarAccess.getIfThenAccess().getElseKeyword_8_0());
                        
                    otherlv_9=(Token)match(input,24,FOLLOW_24_in_ruleIfThen2176); 

                        	newLeafNode(otherlv_9, grammarAccess.getIfThenAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1000:1: ( (lv_elseActions_10_0= ruleAction ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>=13 && LA8_0<=14)||LA8_0==17||(LA8_0>=19 && LA8_0<=21)||LA8_0==23||LA8_0==28||LA8_0==33) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1001:1: (lv_elseActions_10_0= ruleAction )
                    	    {
                    	    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1001:1: (lv_elseActions_10_0= ruleAction )
                    	    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1002:3: lv_elseActions_10_0= ruleAction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getIfThenAccess().getElseActionsActionParserRuleCall_8_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAction_in_ruleIfThen2197);
                    	    lv_elseActions_10_0=ruleAction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getIfThenRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elseActions",
                    	            		lv_elseActions_10_0, 
                    	            		"Action");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,25,FOLLOW_25_in_ruleIfThen2210); 

                        	newLeafNode(otherlv_11, grammarAccess.getIfThenAccess().getRightCurlyBracketKeyword_8_3());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfThen"


    // $ANTLR start "entryRuleSubroutine"
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1030:1: entryRuleSubroutine returns [EObject current=null] : iv_ruleSubroutine= ruleSubroutine EOF ;
    public final EObject entryRuleSubroutine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubroutine = null;


        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1031:2: (iv_ruleSubroutine= ruleSubroutine EOF )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1032:2: iv_ruleSubroutine= ruleSubroutine EOF
            {
             newCompositeNode(grammarAccess.getSubroutineRule()); 
            pushFollow(FOLLOW_ruleSubroutine_in_entryRuleSubroutine2248);
            iv_ruleSubroutine=ruleSubroutine();

            state._fsp--;

             current =iv_ruleSubroutine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubroutine2258); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubroutine"


    // $ANTLR start "ruleSubroutine"
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1039:1: ruleSubroutine returns [EObject current=null] : (otherlv_0= 'Def' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleVariableId ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleVariableId ) ) )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_actions_8_0= ruleAction ) )* otherlv_9= '}' ) ;
    public final EObject ruleSubroutine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_actions_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1042:28: ( (otherlv_0= 'Def' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleVariableId ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleVariableId ) ) )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_actions_8_0= ruleAction ) )* otherlv_9= '}' ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1043:1: (otherlv_0= 'Def' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleVariableId ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleVariableId ) ) )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_actions_8_0= ruleAction ) )* otherlv_9= '}' )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1043:1: (otherlv_0= 'Def' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleVariableId ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleVariableId ) ) )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_actions_8_0= ruleAction ) )* otherlv_9= '}' )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1043:3: otherlv_0= 'Def' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleVariableId ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleVariableId ) ) )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_actions_8_0= ruleAction ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleSubroutine2295); 

                	newLeafNode(otherlv_0, grammarAccess.getSubroutineAccess().getDefKeyword_0());
                
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1047:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1048:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1048:1: (lv_name_1_0= RULE_ID )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1049:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubroutine2312); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSubroutineAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSubroutineRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1065:2: (otherlv_2= '(' ( (lv_params_3_0= ruleVariableId ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleVariableId ) ) )? otherlv_6= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1065:4: otherlv_2= '(' ( (lv_params_3_0= ruleVariableId ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleVariableId ) ) )? otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleSubroutine2330); 

                        	newLeafNode(otherlv_2, grammarAccess.getSubroutineAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1069:1: ( (lv_params_3_0= ruleVariableId ) )
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1070:1: (lv_params_3_0= ruleVariableId )
                    {
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1070:1: (lv_params_3_0= ruleVariableId )
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1071:3: lv_params_3_0= ruleVariableId
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubroutineAccess().getParamsVariableIdParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableId_in_ruleSubroutine2351);
                    lv_params_3_0=ruleVariableId();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubroutineRule());
                    	        }
                           		add(
                           			current, 
                           			"params",
                            		lv_params_3_0, 
                            		"VariableId");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1087:2: (otherlv_4= ',' ( (lv_params_5_0= ruleVariableId ) ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==32) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1087:4: otherlv_4= ',' ( (lv_params_5_0= ruleVariableId ) )
                            {
                            otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleSubroutine2364); 

                                	newLeafNode(otherlv_4, grammarAccess.getSubroutineAccess().getCommaKeyword_2_2_0());
                                
                            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1091:1: ( (lv_params_5_0= ruleVariableId ) )
                            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1092:1: (lv_params_5_0= ruleVariableId )
                            {
                            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1092:1: (lv_params_5_0= ruleVariableId )
                            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1093:3: lv_params_5_0= ruleVariableId
                            {
                             
                            	        newCompositeNode(grammarAccess.getSubroutineAccess().getParamsVariableIdParserRuleCall_2_2_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleVariableId_in_ruleSubroutine2385);
                            lv_params_5_0=ruleVariableId();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getSubroutineRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"params",
                                    		lv_params_5_0, 
                                    		"VariableId");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleSubroutine2399); 

                        	newLeafNode(otherlv_6, grammarAccess.getSubroutineAccess().getRightParenthesisKeyword_2_3());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleSubroutine2413); 

                	newLeafNode(otherlv_7, grammarAccess.getSubroutineAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1117:1: ( (lv_actions_8_0= ruleAction ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=13 && LA12_0<=14)||LA12_0==17||(LA12_0>=19 && LA12_0<=21)||LA12_0==23||LA12_0==28||LA12_0==33) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1118:1: (lv_actions_8_0= ruleAction )
            	    {
            	    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1118:1: (lv_actions_8_0= ruleAction )
            	    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1119:3: lv_actions_8_0= ruleAction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSubroutineAccess().getActionsActionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAction_in_ruleSubroutine2434);
            	    lv_actions_8_0=ruleAction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSubroutineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"actions",
            	            		lv_actions_8_0, 
            	            		"Action");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_9=(Token)match(input,25,FOLLOW_25_in_ruleSubroutine2447); 

                	newLeafNode(otherlv_9, grammarAccess.getSubroutineAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubroutine"


    // $ANTLR start "entryRuleSubroutineCall"
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1147:1: entryRuleSubroutineCall returns [EObject current=null] : iv_ruleSubroutineCall= ruleSubroutineCall EOF ;
    public final EObject entryRuleSubroutineCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubroutineCall = null;


        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1148:2: (iv_ruleSubroutineCall= ruleSubroutineCall EOF )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1149:2: iv_ruleSubroutineCall= ruleSubroutineCall EOF
            {
             newCompositeNode(grammarAccess.getSubroutineCallRule()); 
            pushFollow(FOLLOW_ruleSubroutineCall_in_entryRuleSubroutineCall2483);
            iv_ruleSubroutineCall=ruleSubroutineCall();

            state._fsp--;

             current =iv_ruleSubroutineCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubroutineCall2493); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubroutineCall"


    // $ANTLR start "ruleSubroutineCall"
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1156:1: ruleSubroutineCall returns [EObject current=null] : (otherlv_0= 'Call' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleSubroutineCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1159:28: ( (otherlv_0= 'Call' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1160:1: (otherlv_0= 'Call' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1160:1: (otherlv_0= 'Call' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1160:3: otherlv_0= 'Call' ( (otherlv_1= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleSubroutineCall2530); 

                	newLeafNode(otherlv_0, grammarAccess.getSubroutineCallAccess().getCallKeyword_0());
                
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1164:1: ( (otherlv_1= RULE_ID ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1165:1: (otherlv_1= RULE_ID )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1165:1: (otherlv_1= RULE_ID )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1166:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSubroutineCallRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubroutineCall2550); 

            		newLeafNode(otherlv_1, grammarAccess.getSubroutineCallAccess().getSubroutineSubroutineCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSubroutineCall2562); 

                	newLeafNode(otherlv_2, grammarAccess.getSubroutineCallAccess().getSemicolonKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubroutineCall"


    // $ANTLR start "entryRuleVariableId"
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1189:1: entryRuleVariableId returns [EObject current=null] : iv_ruleVariableId= ruleVariableId EOF ;
    public final EObject entryRuleVariableId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableId = null;


        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1190:2: (iv_ruleVariableId= ruleVariableId EOF )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1191:2: iv_ruleVariableId= ruleVariableId EOF
            {
             newCompositeNode(grammarAccess.getVariableIdRule()); 
            pushFollow(FOLLOW_ruleVariableId_in_entryRuleVariableId2598);
            iv_ruleVariableId=ruleVariableId();

            state._fsp--;

             current =iv_ruleVariableId; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableId2608); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableId"


    // $ANTLR start "ruleVariableId"
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1198:1: ruleVariableId returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleVariableId() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1201:28: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1202:1: ( (lv_name_0_0= RULE_STRING ) )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1202:1: ( (lv_name_0_0= RULE_STRING ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1203:1: (lv_name_0_0= RULE_STRING )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1203:1: (lv_name_0_0= RULE_STRING )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1204:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVariableId2649); 

            			newLeafNode(lv_name_0_0, grammarAccess.getVariableIdAccess().getNameSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableIdRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"STRING");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableId"


    // $ANTLR start "ruleBrowser"
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1228:1: ruleBrowser returns [Enumerator current=null] : ( (enumLiteral_0= 'Chrome' ) | (enumLiteral_1= 'Safari' ) | (enumLiteral_2= 'Opera' ) | (enumLiteral_3= 'Firefox' ) | (enumLiteral_4= 'Internet Explorer' ) ) ;
    public final Enumerator ruleBrowser() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1230:28: ( ( (enumLiteral_0= 'Chrome' ) | (enumLiteral_1= 'Safari' ) | (enumLiteral_2= 'Opera' ) | (enumLiteral_3= 'Firefox' ) | (enumLiteral_4= 'Internet Explorer' ) ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1231:1: ( (enumLiteral_0= 'Chrome' ) | (enumLiteral_1= 'Safari' ) | (enumLiteral_2= 'Opera' ) | (enumLiteral_3= 'Firefox' ) | (enumLiteral_4= 'Internet Explorer' ) )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1231:1: ( (enumLiteral_0= 'Chrome' ) | (enumLiteral_1= 'Safari' ) | (enumLiteral_2= 'Opera' ) | (enumLiteral_3= 'Firefox' ) | (enumLiteral_4= 'Internet Explorer' ) )
            int alt13=5;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt13=1;
                }
                break;
            case 35:
                {
                alt13=2;
                }
                break;
            case 36:
                {
                alt13=3;
                }
                break;
            case 37:
                {
                alt13=4;
                }
                break;
            case 38:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1231:2: (enumLiteral_0= 'Chrome' )
                    {
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1231:2: (enumLiteral_0= 'Chrome' )
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1231:4: enumLiteral_0= 'Chrome'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_34_in_ruleBrowser2703); 

                            current = grammarAccess.getBrowserAccess().getChromeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBrowserAccess().getChromeEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1237:6: (enumLiteral_1= 'Safari' )
                    {
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1237:6: (enumLiteral_1= 'Safari' )
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1237:8: enumLiteral_1= 'Safari'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_35_in_ruleBrowser2720); 

                            current = grammarAccess.getBrowserAccess().getSafariEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBrowserAccess().getSafariEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1243:6: (enumLiteral_2= 'Opera' )
                    {
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1243:6: (enumLiteral_2= 'Opera' )
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1243:8: enumLiteral_2= 'Opera'
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_36_in_ruleBrowser2737); 

                            current = grammarAccess.getBrowserAccess().getOperaEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getBrowserAccess().getOperaEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1249:6: (enumLiteral_3= 'Firefox' )
                    {
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1249:6: (enumLiteral_3= 'Firefox' )
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1249:8: enumLiteral_3= 'Firefox'
                    {
                    enumLiteral_3=(Token)match(input,37,FOLLOW_37_in_ruleBrowser2754); 

                            current = grammarAccess.getBrowserAccess().getFirefoxEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getBrowserAccess().getFirefoxEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1255:6: (enumLiteral_4= 'Internet Explorer' )
                    {
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1255:6: (enumLiteral_4= 'Internet Explorer' )
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1255:8: enumLiteral_4= 'Internet Explorer'
                    {
                    enumLiteral_4=(Token)match(input,38,FOLLOW_38_in_ruleBrowser2771); 

                            current = grammarAccess.getBrowserAccess().getIeEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getBrowserAccess().getIeEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBrowser"


    // $ANTLR start "ruleOperator"
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1265:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1267:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1268:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1268:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>' ) | (enumLiteral_3= '<' ) | (enumLiteral_4= '>=' ) | (enumLiteral_5= '<=' ) )
            int alt14=6;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt14=1;
                }
                break;
            case 40:
                {
                alt14=2;
                }
                break;
            case 41:
                {
                alt14=3;
                }
                break;
            case 42:
                {
                alt14=4;
                }
                break;
            case 43:
                {
                alt14=5;
                }
                break;
            case 44:
                {
                alt14=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1268:2: (enumLiteral_0= '==' )
                    {
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1268:2: (enumLiteral_0= '==' )
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1268:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_39_in_ruleOperator2816); 

                            current = grammarAccess.getOperatorAccess().getEqualsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getEqualsEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1274:6: (enumLiteral_1= '!=' )
                    {
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1274:6: (enumLiteral_1= '!=' )
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1274:8: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_40_in_ruleOperator2833); 

                            current = grammarAccess.getOperatorAccess().getNotEqualsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getNotEqualsEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1280:6: (enumLiteral_2= '>' )
                    {
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1280:6: (enumLiteral_2= '>' )
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1280:8: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_41_in_ruleOperator2850); 

                            current = grammarAccess.getOperatorAccess().getGtEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getOperatorAccess().getGtEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1286:6: (enumLiteral_3= '<' )
                    {
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1286:6: (enumLiteral_3= '<' )
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1286:8: enumLiteral_3= '<'
                    {
                    enumLiteral_3=(Token)match(input,42,FOLLOW_42_in_ruleOperator2867); 

                            current = grammarAccess.getOperatorAccess().getLtEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getOperatorAccess().getLtEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1292:6: (enumLiteral_4= '>=' )
                    {
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1292:6: (enumLiteral_4= '>=' )
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1292:8: enumLiteral_4= '>='
                    {
                    enumLiteral_4=(Token)match(input,43,FOLLOW_43_in_ruleOperator2884); 

                            current = grammarAccess.getOperatorAccess().getGteEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getOperatorAccess().getGteEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1298:6: (enumLiteral_5= '<=' )
                    {
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1298:6: (enumLiteral_5= '<=' )
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:1298:8: enumLiteral_5= '<='
                    {
                    enumLiteral_5=(Token)match(input,44,FOLLOW_44_in_ruleOperator2901); 

                            current = grammarAccess.getOperatorAccess().getLteEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getOperatorAccess().getLteEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperator"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleBrowserAutomation_in_entryRuleBrowserAutomation75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBrowserAutomation85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubroutine_in_ruleBrowserAutomation131 = new BitSet(new long[]{0x0000000080000800L});
    public static final BitSet FOLLOW_11_in_ruleBrowserAutomation144 = new BitSet(new long[]{0x0000007C00000000L});
    public static final BitSet FOLLOW_ruleBrowser_in_ruleBrowserAutomation165 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleBrowserAutomation177 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleGoto_in_ruleBrowserAutomation198 = new BitSet(new long[]{0x0000000210BA6002L});
    public static final BitSet FOLLOW_ruleAction_in_ruleBrowserAutomation219 = new BitSet(new long[]{0x0000000210BA6002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoto_in_ruleAction313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClickOn_in_ruleAction340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFill_in_ruleAction367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheck_in_ruleAction394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUncheck_in_ruleAction421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLet_in_ruleAction448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoWhile_in_ruleAction475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfThen_in_ruleAction502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubroutineCall_in_ruleAction529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoto_in_entryRuleGoto564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoto574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleGoto611 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleValue_in_ruleGoto632 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGoto644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClickOn_in_entryRuleClickOn680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClickOn690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleClickOn727 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleSelector_in_ruleClickOn748 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleClickOn760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelector_in_entryRuleSelector796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelector806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSelector843 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSelector860 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSelector877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFill_in_entryRuleFill913 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFill923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleFill960 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleSelector_in_ruleFill981 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFill993 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleValue_in_ruleFill1014 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFill1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheck_in_entryRuleCheck1062 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheck1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleCheck1109 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleSelector_in_ruleCheck1130 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCheck1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUncheck_in_entryRuleUncheck1178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUncheck1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleUncheck1225 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleSelector_in_ruleUncheck1246 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUncheck1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLet_in_entryRuleLet1294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLet1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleLet1341 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableId_in_ruleLet1362 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleLet1374 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_ruleLetValue_in_ruleLet1395 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleLet1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLetValue_in_entryRuleLetValue1443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLetValue1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelector_in_ruleLetValue1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleLetValue1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValue1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValue1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoWhile_in_entryRuleDoWhile1681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoWhile1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleDoWhile1728 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDoWhile1740 = new BitSet(new long[]{0x0000000212BA6000L});
    public static final BitSet FOLLOW_ruleAction_in_ruleDoWhile1761 = new BitSet(new long[]{0x0000000212BA6000L});
    public static final BitSet FOLLOW_25_in_ruleDoWhile1774 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleDoWhile1786 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleDoWhile1798 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleBooleanExp_in_ruleDoWhile1819 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDoWhile1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExp_in_entryRuleBooleanExp1867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExp1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleBooleanExp1923 = new BitSet(new long[]{0x00001F8000000000L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleBooleanExp1944 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleValue_in_ruleBooleanExp1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfThen_in_entryRuleIfThen2001 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfThen2011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleIfThen2048 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleIfThen2060 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleBooleanExp_in_ruleIfThen2081 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleIfThen2093 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleIfThen2105 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleIfThen2117 = new BitSet(new long[]{0x0000000212BA6000L});
    public static final BitSet FOLLOW_ruleAction_in_ruleIfThen2138 = new BitSet(new long[]{0x0000000212BA6000L});
    public static final BitSet FOLLOW_25_in_ruleIfThen2151 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleIfThen2164 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleIfThen2176 = new BitSet(new long[]{0x0000000212BA6000L});
    public static final BitSet FOLLOW_ruleAction_in_ruleIfThen2197 = new BitSet(new long[]{0x0000000212BA6000L});
    public static final BitSet FOLLOW_25_in_ruleIfThen2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubroutine_in_entryRuleSubroutine2248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubroutine2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleSubroutine2295 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubroutine2312 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_27_in_ruleSubroutine2330 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableId_in_ruleSubroutine2351 = new BitSet(new long[]{0x0000000100010000L});
    public static final BitSet FOLLOW_32_in_ruleSubroutine2364 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableId_in_ruleSubroutine2385 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSubroutine2399 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSubroutine2413 = new BitSet(new long[]{0x0000000212BA6000L});
    public static final BitSet FOLLOW_ruleAction_in_ruleSubroutine2434 = new BitSet(new long[]{0x0000000212BA6000L});
    public static final BitSet FOLLOW_25_in_ruleSubroutine2447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubroutineCall_in_entryRuleSubroutineCall2483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubroutineCall2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleSubroutineCall2530 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubroutineCall2550 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSubroutineCall2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableId_in_entryRuleVariableId2598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableId2608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVariableId2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleBrowser2703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleBrowser2720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleBrowser2737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleBrowser2754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleBrowser2771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOperator2816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOperator2833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOperator2850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOperator2867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleOperator2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleOperator2901 = new BitSet(new long[]{0x0000000000000002L});

}