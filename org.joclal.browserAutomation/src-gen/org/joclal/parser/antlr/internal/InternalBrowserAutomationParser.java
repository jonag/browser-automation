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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'browser'", "';'", "'GoTo'", "'Click'", "'select('", "')'", "'Fill'", "'with'", "'Check'", "'Uncheck'", "'Let'", "'='", "'Chrome'", "'Safari'", "'Opera'", "'Firefox'", "'Internet Explorer'", "'>'", "'<'", "'>='", "'<='"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
        	return "Model";	
       	}
       	
       	@Override
       	protected BrowserAutomationGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:77:1: ruleModel returns [EObject current=null] : (otherlv_0= 'browser' ( (lv_browser_1_0= ruleBrowser ) ) otherlv_2= ';' ( (lv_firstGoTo_3_0= ruleGoto ) ) ( (lv_actions_4_0= ruleAction ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_browser_1_0 = null;

        EObject lv_firstGoTo_3_0 = null;

        EObject lv_actions_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:80:28: ( (otherlv_0= 'browser' ( (lv_browser_1_0= ruleBrowser ) ) otherlv_2= ';' ( (lv_firstGoTo_3_0= ruleGoto ) ) ( (lv_actions_4_0= ruleAction ) )* ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:81:1: (otherlv_0= 'browser' ( (lv_browser_1_0= ruleBrowser ) ) otherlv_2= ';' ( (lv_firstGoTo_3_0= ruleGoto ) ) ( (lv_actions_4_0= ruleAction ) )* )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:81:1: (otherlv_0= 'browser' ( (lv_browser_1_0= ruleBrowser ) ) otherlv_2= ';' ( (lv_firstGoTo_3_0= ruleGoto ) ) ( (lv_actions_4_0= ruleAction ) )* )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:81:3: otherlv_0= 'browser' ( (lv_browser_1_0= ruleBrowser ) ) otherlv_2= ';' ( (lv_firstGoTo_3_0= ruleGoto ) ) ( (lv_actions_4_0= ruleAction ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getBrowserKeyword_0());
                
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:85:1: ( (lv_browser_1_0= ruleBrowser ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:86:1: (lv_browser_1_0= ruleBrowser )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:86:1: (lv_browser_1_0= ruleBrowser )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:87:3: lv_browser_1_0= ruleBrowser
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getBrowserBrowserEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBrowser_in_ruleModel143);
            lv_browser_1_0=ruleBrowser();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"browser",
                    		lv_browser_1_0, 
                    		"Browser");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleModel155); 

                	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getSemicolonKeyword_2());
                
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:107:1: ( (lv_firstGoTo_3_0= ruleGoto ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:108:1: (lv_firstGoTo_3_0= ruleGoto )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:108:1: (lv_firstGoTo_3_0= ruleGoto )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:109:3: lv_firstGoTo_3_0= ruleGoto
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getFirstGoToGotoParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleGoto_in_ruleModel176);
            lv_firstGoTo_3_0=ruleGoto();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"firstGoTo",
                    		lv_firstGoTo_3_0, 
                    		"Goto");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:125:2: ( (lv_actions_4_0= ruleAction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=13 && LA1_0<=14)||LA1_0==17||(LA1_0>=19 && LA1_0<=21)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:126:1: (lv_actions_4_0= ruleAction )
            	    {
            	    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:126:1: (lv_actions_4_0= ruleAction )
            	    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:127:3: lv_actions_4_0= ruleAction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getActionsActionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAction_in_ruleModel197);
            	    lv_actions_4_0=ruleAction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"actions",
            	            		lv_actions_4_0, 
            	            		"Action");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAction"
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:151:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:152:2: (iv_ruleAction= ruleAction EOF )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:153:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction234);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction244); 

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
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:160:1: ruleAction returns [EObject current=null] : (this_Goto_0= ruleGoto | this_ClickOn_1= ruleClickOn | this_Fill_2= ruleFill | this_Check_3= ruleCheck | this_Uncheck_4= ruleUncheck | this_Let_5= ruleLet ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_Goto_0 = null;

        EObject this_ClickOn_1 = null;

        EObject this_Fill_2 = null;

        EObject this_Check_3 = null;

        EObject this_Uncheck_4 = null;

        EObject this_Let_5 = null;


         enterRule(); 
            
        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:163:28: ( (this_Goto_0= ruleGoto | this_ClickOn_1= ruleClickOn | this_Fill_2= ruleFill | this_Check_3= ruleCheck | this_Uncheck_4= ruleUncheck | this_Let_5= ruleLet ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:164:1: (this_Goto_0= ruleGoto | this_ClickOn_1= ruleClickOn | this_Fill_2= ruleFill | this_Check_3= ruleCheck | this_Uncheck_4= ruleUncheck | this_Let_5= ruleLet )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:164:1: (this_Goto_0= ruleGoto | this_ClickOn_1= ruleClickOn | this_Fill_2= ruleFill | this_Check_3= ruleCheck | this_Uncheck_4= ruleUncheck | this_Let_5= ruleLet )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 17:
                {
                alt2=3;
                }
                break;
            case 19:
                {
                alt2=4;
                }
                break;
            case 20:
                {
                alt2=5;
                }
                break;
            case 21:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:165:5: this_Goto_0= ruleGoto
                    {
                     
                            newCompositeNode(grammarAccess.getActionAccess().getGotoParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleGoto_in_ruleAction291);
                    this_Goto_0=ruleGoto();

                    state._fsp--;

                     
                            current = this_Goto_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:175:5: this_ClickOn_1= ruleClickOn
                    {
                     
                            newCompositeNode(grammarAccess.getActionAccess().getClickOnParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleClickOn_in_ruleAction318);
                    this_ClickOn_1=ruleClickOn();

                    state._fsp--;

                     
                            current = this_ClickOn_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:185:5: this_Fill_2= ruleFill
                    {
                     
                            newCompositeNode(grammarAccess.getActionAccess().getFillParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFill_in_ruleAction345);
                    this_Fill_2=ruleFill();

                    state._fsp--;

                     
                            current = this_Fill_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:195:5: this_Check_3= ruleCheck
                    {
                     
                            newCompositeNode(grammarAccess.getActionAccess().getCheckParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleCheck_in_ruleAction372);
                    this_Check_3=ruleCheck();

                    state._fsp--;

                     
                            current = this_Check_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:205:5: this_Uncheck_4= ruleUncheck
                    {
                     
                            newCompositeNode(grammarAccess.getActionAccess().getUncheckParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleUncheck_in_ruleAction399);
                    this_Uncheck_4=ruleUncheck();

                    state._fsp--;

                     
                            current = this_Uncheck_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:215:5: this_Let_5= ruleLet
                    {
                     
                            newCompositeNode(grammarAccess.getActionAccess().getLetParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleLet_in_ruleAction426);
                    this_Let_5=ruleLet();

                    state._fsp--;

                     
                            current = this_Let_5; 
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
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:231:1: entryRuleGoto returns [EObject current=null] : iv_ruleGoto= ruleGoto EOF ;
    public final EObject entryRuleGoto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoto = null;


        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:232:2: (iv_ruleGoto= ruleGoto EOF )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:233:2: iv_ruleGoto= ruleGoto EOF
            {
             newCompositeNode(grammarAccess.getGotoRule()); 
            pushFollow(FOLLOW_ruleGoto_in_entryRuleGoto461);
            iv_ruleGoto=ruleGoto();

            state._fsp--;

             current =iv_ruleGoto; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoto471); 

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
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:240:1: ruleGoto returns [EObject current=null] : (otherlv_0= 'GoTo' ( (lv_url_1_0= ruleValue ) ) otherlv_2= ';' ) ;
    public final EObject ruleGoto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_url_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:243:28: ( (otherlv_0= 'GoTo' ( (lv_url_1_0= ruleValue ) ) otherlv_2= ';' ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:244:1: (otherlv_0= 'GoTo' ( (lv_url_1_0= ruleValue ) ) otherlv_2= ';' )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:244:1: (otherlv_0= 'GoTo' ( (lv_url_1_0= ruleValue ) ) otherlv_2= ';' )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:244:3: otherlv_0= 'GoTo' ( (lv_url_1_0= ruleValue ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleGoto508); 

                	newLeafNode(otherlv_0, grammarAccess.getGotoAccess().getGoToKeyword_0());
                
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:248:1: ( (lv_url_1_0= ruleValue ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:249:1: (lv_url_1_0= ruleValue )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:249:1: (lv_url_1_0= ruleValue )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:250:3: lv_url_1_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getGotoAccess().getUrlValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleGoto529);
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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleGoto541); 

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
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:278:1: entryRuleClickOn returns [EObject current=null] : iv_ruleClickOn= ruleClickOn EOF ;
    public final EObject entryRuleClickOn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClickOn = null;


        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:279:2: (iv_ruleClickOn= ruleClickOn EOF )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:280:2: iv_ruleClickOn= ruleClickOn EOF
            {
             newCompositeNode(grammarAccess.getClickOnRule()); 
            pushFollow(FOLLOW_ruleClickOn_in_entryRuleClickOn577);
            iv_ruleClickOn=ruleClickOn();

            state._fsp--;

             current =iv_ruleClickOn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClickOn587); 

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
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:287:1: ruleClickOn returns [EObject current=null] : (otherlv_0= 'Click' ( (lv_selector_1_0= ruleSelector ) ) otherlv_2= ';' ) ;
    public final EObject ruleClickOn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_selector_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:290:28: ( (otherlv_0= 'Click' ( (lv_selector_1_0= ruleSelector ) ) otherlv_2= ';' ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:291:1: (otherlv_0= 'Click' ( (lv_selector_1_0= ruleSelector ) ) otherlv_2= ';' )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:291:1: (otherlv_0= 'Click' ( (lv_selector_1_0= ruleSelector ) ) otherlv_2= ';' )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:291:3: otherlv_0= 'Click' ( (lv_selector_1_0= ruleSelector ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleClickOn624); 

                	newLeafNode(otherlv_0, grammarAccess.getClickOnAccess().getClickKeyword_0());
                
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:295:1: ( (lv_selector_1_0= ruleSelector ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:296:1: (lv_selector_1_0= ruleSelector )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:296:1: (lv_selector_1_0= ruleSelector )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:297:3: lv_selector_1_0= ruleSelector
            {
             
            	        newCompositeNode(grammarAccess.getClickOnAccess().getSelectorSelectorParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSelector_in_ruleClickOn645);
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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleClickOn657); 

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
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:325:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:326:2: (iv_ruleSelector= ruleSelector EOF )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:327:2: iv_ruleSelector= ruleSelector EOF
            {
             newCompositeNode(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_ruleSelector_in_entryRuleSelector693);
            iv_ruleSelector=ruleSelector();

            state._fsp--;

             current =iv_ruleSelector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelector703); 

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
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:334:1: ruleSelector returns [EObject current=null] : (otherlv_0= 'select(' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ')' ) ;
    public final EObject ruleSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:337:28: ( (otherlv_0= 'select(' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ')' ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:338:1: (otherlv_0= 'select(' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ')' )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:338:1: (otherlv_0= 'select(' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ')' )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:338:3: otherlv_0= 'select(' ( (lv_id_1_0= RULE_STRING ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSelector740); 

                	newLeafNode(otherlv_0, grammarAccess.getSelectorAccess().getSelectKeyword_0());
                
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:342:1: ( (lv_id_1_0= RULE_STRING ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:343:1: (lv_id_1_0= RULE_STRING )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:343:1: (lv_id_1_0= RULE_STRING )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:344:3: lv_id_1_0= RULE_STRING
            {
            lv_id_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSelector757); 

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

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleSelector774); 

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
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:372:1: entryRuleFill returns [EObject current=null] : iv_ruleFill= ruleFill EOF ;
    public final EObject entryRuleFill() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFill = null;


        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:373:2: (iv_ruleFill= ruleFill EOF )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:374:2: iv_ruleFill= ruleFill EOF
            {
             newCompositeNode(grammarAccess.getFillRule()); 
            pushFollow(FOLLOW_ruleFill_in_entryRuleFill810);
            iv_ruleFill=ruleFill();

            state._fsp--;

             current =iv_ruleFill; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFill820); 

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
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:381:1: ruleFill returns [EObject current=null] : (otherlv_0= 'Fill' ( (lv_field_1_0= ruleSelector ) ) otherlv_2= 'with' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ';' ) ;
    public final EObject ruleFill() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_field_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:384:28: ( (otherlv_0= 'Fill' ( (lv_field_1_0= ruleSelector ) ) otherlv_2= 'with' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ';' ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:385:1: (otherlv_0= 'Fill' ( (lv_field_1_0= ruleSelector ) ) otherlv_2= 'with' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ';' )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:385:1: (otherlv_0= 'Fill' ( (lv_field_1_0= ruleSelector ) ) otherlv_2= 'with' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ';' )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:385:3: otherlv_0= 'Fill' ( (lv_field_1_0= ruleSelector ) ) otherlv_2= 'with' ( (lv_value_3_0= ruleValue ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleFill857); 

                	newLeafNode(otherlv_0, grammarAccess.getFillAccess().getFillKeyword_0());
                
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:389:1: ( (lv_field_1_0= ruleSelector ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:390:1: (lv_field_1_0= ruleSelector )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:390:1: (lv_field_1_0= ruleSelector )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:391:3: lv_field_1_0= ruleSelector
            {
             
            	        newCompositeNode(grammarAccess.getFillAccess().getFieldSelectorParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSelector_in_ruleFill878);
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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleFill890); 

                	newLeafNode(otherlv_2, grammarAccess.getFillAccess().getWithKeyword_2());
                
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:411:1: ( (lv_value_3_0= ruleValue ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:412:1: (lv_value_3_0= ruleValue )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:412:1: (lv_value_3_0= ruleValue )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:413:3: lv_value_3_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getFillAccess().getValueValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleFill911);
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

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleFill923); 

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
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:441:1: entryRuleCheck returns [EObject current=null] : iv_ruleCheck= ruleCheck EOF ;
    public final EObject entryRuleCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheck = null;


        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:442:2: (iv_ruleCheck= ruleCheck EOF )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:443:2: iv_ruleCheck= ruleCheck EOF
            {
             newCompositeNode(grammarAccess.getCheckRule()); 
            pushFollow(FOLLOW_ruleCheck_in_entryRuleCheck959);
            iv_ruleCheck=ruleCheck();

            state._fsp--;

             current =iv_ruleCheck; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheck969); 

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
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:450:1: ruleCheck returns [EObject current=null] : (otherlv_0= 'Check' ( (lv_checkbox_1_0= ruleSelector ) ) otherlv_2= ';' ) ;
    public final EObject ruleCheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_checkbox_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:453:28: ( (otherlv_0= 'Check' ( (lv_checkbox_1_0= ruleSelector ) ) otherlv_2= ';' ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:454:1: (otherlv_0= 'Check' ( (lv_checkbox_1_0= ruleSelector ) ) otherlv_2= ';' )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:454:1: (otherlv_0= 'Check' ( (lv_checkbox_1_0= ruleSelector ) ) otherlv_2= ';' )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:454:3: otherlv_0= 'Check' ( (lv_checkbox_1_0= ruleSelector ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleCheck1006); 

                	newLeafNode(otherlv_0, grammarAccess.getCheckAccess().getCheckKeyword_0());
                
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:458:1: ( (lv_checkbox_1_0= ruleSelector ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:459:1: (lv_checkbox_1_0= ruleSelector )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:459:1: (lv_checkbox_1_0= ruleSelector )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:460:3: lv_checkbox_1_0= ruleSelector
            {
             
            	        newCompositeNode(grammarAccess.getCheckAccess().getCheckboxSelectorParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSelector_in_ruleCheck1027);
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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleCheck1039); 

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
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:488:1: entryRuleUncheck returns [EObject current=null] : iv_ruleUncheck= ruleUncheck EOF ;
    public final EObject entryRuleUncheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUncheck = null;


        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:489:2: (iv_ruleUncheck= ruleUncheck EOF )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:490:2: iv_ruleUncheck= ruleUncheck EOF
            {
             newCompositeNode(grammarAccess.getUncheckRule()); 
            pushFollow(FOLLOW_ruleUncheck_in_entryRuleUncheck1075);
            iv_ruleUncheck=ruleUncheck();

            state._fsp--;

             current =iv_ruleUncheck; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUncheck1085); 

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
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:497:1: ruleUncheck returns [EObject current=null] : (otherlv_0= 'Uncheck' ( (lv_checkbox_1_0= ruleSelector ) ) otherlv_2= ';' ) ;
    public final EObject ruleUncheck() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_checkbox_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:500:28: ( (otherlv_0= 'Uncheck' ( (lv_checkbox_1_0= ruleSelector ) ) otherlv_2= ';' ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:501:1: (otherlv_0= 'Uncheck' ( (lv_checkbox_1_0= ruleSelector ) ) otherlv_2= ';' )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:501:1: (otherlv_0= 'Uncheck' ( (lv_checkbox_1_0= ruleSelector ) ) otherlv_2= ';' )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:501:3: otherlv_0= 'Uncheck' ( (lv_checkbox_1_0= ruleSelector ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleUncheck1122); 

                	newLeafNode(otherlv_0, grammarAccess.getUncheckAccess().getUncheckKeyword_0());
                
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:505:1: ( (lv_checkbox_1_0= ruleSelector ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:506:1: (lv_checkbox_1_0= ruleSelector )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:506:1: (lv_checkbox_1_0= ruleSelector )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:507:3: lv_checkbox_1_0= ruleSelector
            {
             
            	        newCompositeNode(grammarAccess.getUncheckAccess().getCheckboxSelectorParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSelector_in_ruleUncheck1143);
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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleUncheck1155); 

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
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:535:1: entryRuleLet returns [EObject current=null] : iv_ruleLet= ruleLet EOF ;
    public final EObject entryRuleLet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLet = null;


        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:536:2: (iv_ruleLet= ruleLet EOF )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:537:2: iv_ruleLet= ruleLet EOF
            {
             newCompositeNode(grammarAccess.getLetRule()); 
            pushFollow(FOLLOW_ruleLet_in_entryRuleLet1191);
            iv_ruleLet=ruleLet();

            state._fsp--;

             current =iv_ruleLet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLet1201); 

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
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:544:1: ruleLet returns [EObject current=null] : (otherlv_0= 'Let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleLetValue ) ) otherlv_4= ';' ) ;
    public final EObject ruleLet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:547:28: ( (otherlv_0= 'Let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleLetValue ) ) otherlv_4= ';' ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:548:1: (otherlv_0= 'Let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleLetValue ) ) otherlv_4= ';' )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:548:1: (otherlv_0= 'Let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleLetValue ) ) otherlv_4= ';' )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:548:3: otherlv_0= 'Let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleLetValue ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleLet1238); 

                	newLeafNode(otherlv_0, grammarAccess.getLetAccess().getLetKeyword_0());
                
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:552:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:553:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:553:1: (lv_name_1_0= RULE_ID )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:554:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLet1255); 

            			newLeafNode(lv_name_1_0, grammarAccess.getLetAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleLet1272); 

                	newLeafNode(otherlv_2, grammarAccess.getLetAccess().getEqualsSignKeyword_2());
                
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:574:1: ( (lv_value_3_0= ruleLetValue ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:575:1: (lv_value_3_0= ruleLetValue )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:575:1: (lv_value_3_0= ruleLetValue )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:576:3: lv_value_3_0= ruleLetValue
            {
             
            	        newCompositeNode(grammarAccess.getLetAccess().getValueLetValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleLetValue_in_ruleLet1293);
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

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleLet1305); 

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
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:604:1: entryRuleLetValue returns [EObject current=null] : iv_ruleLetValue= ruleLetValue EOF ;
    public final EObject entryRuleLetValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetValue = null;


        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:605:2: (iv_ruleLetValue= ruleLetValue EOF )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:606:2: iv_ruleLetValue= ruleLetValue EOF
            {
             newCompositeNode(grammarAccess.getLetValueRule()); 
            pushFollow(FOLLOW_ruleLetValue_in_entryRuleLetValue1341);
            iv_ruleLetValue=ruleLetValue();

            state._fsp--;

             current =iv_ruleLetValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLetValue1351); 

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
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:613:1: ruleLetValue returns [EObject current=null] : ( ( (lv_selector_0_0= ruleSelector ) ) | ( (lv_value_1_0= ruleValue ) ) ) ;
    public final EObject ruleLetValue() throws RecognitionException {
        EObject current = null;

        EObject lv_selector_0_0 = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:616:28: ( ( ( (lv_selector_0_0= ruleSelector ) ) | ( (lv_value_1_0= ruleValue ) ) ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:617:1: ( ( (lv_selector_0_0= ruleSelector ) ) | ( (lv_value_1_0= ruleValue ) ) )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:617:1: ( ( (lv_selector_0_0= ruleSelector ) ) | ( (lv_value_1_0= ruleValue ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_INT)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:617:2: ( (lv_selector_0_0= ruleSelector ) )
                    {
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:617:2: ( (lv_selector_0_0= ruleSelector ) )
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:618:1: (lv_selector_0_0= ruleSelector )
                    {
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:618:1: (lv_selector_0_0= ruleSelector )
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:619:3: lv_selector_0_0= ruleSelector
                    {
                     
                    	        newCompositeNode(grammarAccess.getLetValueAccess().getSelectorSelectorParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSelector_in_ruleLetValue1397);
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
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:636:6: ( (lv_value_1_0= ruleValue ) )
                    {
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:636:6: ( (lv_value_1_0= ruleValue ) )
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:637:1: (lv_value_1_0= ruleValue )
                    {
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:637:1: (lv_value_1_0= ruleValue )
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:638:3: lv_value_1_0= ruleValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getLetValueAccess().getValueValueParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValue_in_ruleLetValue1424);
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
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:662:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:663:2: (iv_ruleValue= ruleValue EOF )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:664:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue1460);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue1470); 

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
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:671:1: ruleValue returns [EObject current=null] : ( ( (lv_string_0_0= RULE_STRING ) ) | ( (lv_int_1_0= RULE_INT ) ) | ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token lv_string_0_0=null;
        Token lv_int_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:674:28: ( ( ( (lv_string_0_0= RULE_STRING ) ) | ( (lv_int_1_0= RULE_INT ) ) | ( (otherlv_2= RULE_ID ) ) ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:675:1: ( ( (lv_string_0_0= RULE_STRING ) ) | ( (lv_int_1_0= RULE_INT ) ) | ( (otherlv_2= RULE_ID ) ) )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:675:1: ( ( (lv_string_0_0= RULE_STRING ) ) | ( (lv_int_1_0= RULE_INT ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt4=1;
                }
                break;
            case RULE_INT:
                {
                alt4=2;
                }
                break;
            case RULE_ID:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:675:2: ( (lv_string_0_0= RULE_STRING ) )
                    {
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:675:2: ( (lv_string_0_0= RULE_STRING ) )
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:676:1: (lv_string_0_0= RULE_STRING )
                    {
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:676:1: (lv_string_0_0= RULE_STRING )
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:677:3: lv_string_0_0= RULE_STRING
                    {
                    lv_string_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValue1512); 

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
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:694:6: ( (lv_int_1_0= RULE_INT ) )
                    {
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:694:6: ( (lv_int_1_0= RULE_INT ) )
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:695:1: (lv_int_1_0= RULE_INT )
                    {
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:695:1: (lv_int_1_0= RULE_INT )
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:696:3: lv_int_1_0= RULE_INT
                    {
                    lv_int_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleValue1540); 

                    			newLeafNode(lv_int_1_0, grammarAccess.getValueAccess().getIntINTTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"int",
                            		lv_int_1_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:713:6: ( (otherlv_2= RULE_ID ) )
                    {
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:713:6: ( (otherlv_2= RULE_ID ) )
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:714:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:714:1: (otherlv_2= RULE_ID )
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:715:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getValueRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValue1571); 

                    		newLeafNode(otherlv_2, grammarAccess.getValueAccess().getLetLetCrossReference_2_0()); 
                    	

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


    // $ANTLR start "entryRuleBooleanExp"
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:736:1: entryRuleBooleanExp returns [EObject current=null] : iv_ruleBooleanExp= ruleBooleanExp EOF ;
    public final EObject entryRuleBooleanExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExp = null;


        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:737:2: (iv_ruleBooleanExp= ruleBooleanExp EOF )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:738:2: iv_ruleBooleanExp= ruleBooleanExp EOF
            {
             newCompositeNode(grammarAccess.getBooleanExpRule()); 
            pushFollow(FOLLOW_ruleBooleanExp_in_entryRuleBooleanExp1609);
            iv_ruleBooleanExp=ruleBooleanExp();

            state._fsp--;

             current =iv_ruleBooleanExp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanExp1619); 

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
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:745:1: ruleBooleanExp returns [EObject current=null] : ( ( (lv_leftMember_0_0= ruleValue ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_rightMember_2_0= ruleValue ) ) ) ;
    public final EObject ruleBooleanExp() throws RecognitionException {
        EObject current = null;

        EObject lv_leftMember_0_0 = null;

        Enumerator lv_operator_1_0 = null;

        EObject lv_rightMember_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:748:28: ( ( ( (lv_leftMember_0_0= ruleValue ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_rightMember_2_0= ruleValue ) ) ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:749:1: ( ( (lv_leftMember_0_0= ruleValue ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_rightMember_2_0= ruleValue ) ) )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:749:1: ( ( (lv_leftMember_0_0= ruleValue ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_rightMember_2_0= ruleValue ) ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:749:2: ( (lv_leftMember_0_0= ruleValue ) ) ( (lv_operator_1_0= ruleOperator ) ) ( (lv_rightMember_2_0= ruleValue ) )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:749:2: ( (lv_leftMember_0_0= ruleValue ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:750:1: (lv_leftMember_0_0= ruleValue )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:750:1: (lv_leftMember_0_0= ruleValue )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:751:3: lv_leftMember_0_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getBooleanExpAccess().getLeftMemberValueParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleBooleanExp1665);
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

            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:767:2: ( (lv_operator_1_0= ruleOperator ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:768:1: (lv_operator_1_0= ruleOperator )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:768:1: (lv_operator_1_0= ruleOperator )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:769:3: lv_operator_1_0= ruleOperator
            {
             
            	        newCompositeNode(grammarAccess.getBooleanExpAccess().getOperatorOperatorEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleOperator_in_ruleBooleanExp1686);
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

            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:785:2: ( (lv_rightMember_2_0= ruleValue ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:786:1: (lv_rightMember_2_0= ruleValue )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:786:1: (lv_rightMember_2_0= ruleValue )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:787:3: lv_rightMember_2_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getBooleanExpAccess().getRightMemberValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleBooleanExp1707);
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


    // $ANTLR start "ruleBrowser"
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:813:1: ruleBrowser returns [Enumerator current=null] : ( (enumLiteral_0= 'Chrome' ) | (enumLiteral_1= 'Safari' ) | (enumLiteral_2= 'Opera' ) | (enumLiteral_3= 'Firefox' ) | (enumLiteral_4= 'Internet Explorer' ) ) ;
    public final Enumerator ruleBrowser() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:815:28: ( ( (enumLiteral_0= 'Chrome' ) | (enumLiteral_1= 'Safari' ) | (enumLiteral_2= 'Opera' ) | (enumLiteral_3= 'Firefox' ) | (enumLiteral_4= 'Internet Explorer' ) ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:816:1: ( (enumLiteral_0= 'Chrome' ) | (enumLiteral_1= 'Safari' ) | (enumLiteral_2= 'Opera' ) | (enumLiteral_3= 'Firefox' ) | (enumLiteral_4= 'Internet Explorer' ) )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:816:1: ( (enumLiteral_0= 'Chrome' ) | (enumLiteral_1= 'Safari' ) | (enumLiteral_2= 'Opera' ) | (enumLiteral_3= 'Firefox' ) | (enumLiteral_4= 'Internet Explorer' ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt5=1;
                }
                break;
            case 24:
                {
                alt5=2;
                }
                break;
            case 25:
                {
                alt5=3;
                }
                break;
            case 26:
                {
                alt5=4;
                }
                break;
            case 27:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:816:2: (enumLiteral_0= 'Chrome' )
                    {
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:816:2: (enumLiteral_0= 'Chrome' )
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:816:4: enumLiteral_0= 'Chrome'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_23_in_ruleBrowser1759); 

                            current = grammarAccess.getBrowserAccess().getChromeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBrowserAccess().getChromeEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:822:6: (enumLiteral_1= 'Safari' )
                    {
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:822:6: (enumLiteral_1= 'Safari' )
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:822:8: enumLiteral_1= 'Safari'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_24_in_ruleBrowser1776); 

                            current = grammarAccess.getBrowserAccess().getSafariEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBrowserAccess().getSafariEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:828:6: (enumLiteral_2= 'Opera' )
                    {
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:828:6: (enumLiteral_2= 'Opera' )
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:828:8: enumLiteral_2= 'Opera'
                    {
                    enumLiteral_2=(Token)match(input,25,FOLLOW_25_in_ruleBrowser1793); 

                            current = grammarAccess.getBrowserAccess().getOperaEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getBrowserAccess().getOperaEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:834:6: (enumLiteral_3= 'Firefox' )
                    {
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:834:6: (enumLiteral_3= 'Firefox' )
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:834:8: enumLiteral_3= 'Firefox'
                    {
                    enumLiteral_3=(Token)match(input,26,FOLLOW_26_in_ruleBrowser1810); 

                            current = grammarAccess.getBrowserAccess().getFirefoxEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getBrowserAccess().getFirefoxEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:840:6: (enumLiteral_4= 'Internet Explorer' )
                    {
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:840:6: (enumLiteral_4= 'Internet Explorer' )
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:840:8: enumLiteral_4= 'Internet Explorer'
                    {
                    enumLiteral_4=(Token)match(input,27,FOLLOW_27_in_ruleBrowser1827); 

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
    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:850:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<=' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:852:28: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<=' ) ) )
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:853:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<=' ) )
            {
            // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:853:1: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '>=' ) | (enumLiteral_4= '<=' ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt6=1;
                }
                break;
            case 28:
                {
                alt6=2;
                }
                break;
            case 29:
                {
                alt6=3;
                }
                break;
            case 30:
                {
                alt6=4;
                }
                break;
            case 31:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:853:2: (enumLiteral_0= '=' )
                    {
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:853:2: (enumLiteral_0= '=' )
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:853:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_22_in_ruleOperator1872); 

                            current = grammarAccess.getOperatorAccess().getEqualsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getEqualsEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:859:6: (enumLiteral_1= '>' )
                    {
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:859:6: (enumLiteral_1= '>' )
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:859:8: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_28_in_ruleOperator1889); 

                            current = grammarAccess.getOperatorAccess().getGtEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getGtEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:865:6: (enumLiteral_2= '<' )
                    {
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:865:6: (enumLiteral_2= '<' )
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:865:8: enumLiteral_2= '<'
                    {
                    enumLiteral_2=(Token)match(input,29,FOLLOW_29_in_ruleOperator1906); 

                            current = grammarAccess.getOperatorAccess().getLtEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getOperatorAccess().getLtEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:871:6: (enumLiteral_3= '>=' )
                    {
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:871:6: (enumLiteral_3= '>=' )
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:871:8: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,30,FOLLOW_30_in_ruleOperator1923); 

                            current = grammarAccess.getOperatorAccess().getGteEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getOperatorAccess().getGteEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:877:6: (enumLiteral_4= '<=' )
                    {
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:877:6: (enumLiteral_4= '<=' )
                    // ../org.joclal.browserAutomation/src-gen/org/joclal/parser/antlr/internal/InternalBrowserAutomation.g:877:8: enumLiteral_4= '<='
                    {
                    enumLiteral_4=(Token)match(input,31,FOLLOW_31_in_ruleOperator1940); 

                            current = grammarAccess.getOperatorAccess().getLteEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getOperatorAccess().getLteEnumLiteralDeclaration_4()); 
                        

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


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModel122 = new BitSet(new long[]{0x000000000F800000L});
    public static final BitSet FOLLOW_ruleBrowser_in_ruleModel143 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModel155 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleGoto_in_ruleModel176 = new BitSet(new long[]{0x00000000003A6002L});
    public static final BitSet FOLLOW_ruleAction_in_ruleModel197 = new BitSet(new long[]{0x00000000003A6002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoto_in_ruleAction291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClickOn_in_ruleAction318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFill_in_ruleAction345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheck_in_ruleAction372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUncheck_in_ruleAction399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLet_in_ruleAction426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoto_in_entryRuleGoto461 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoto471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleGoto508 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleValue_in_ruleGoto529 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGoto541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClickOn_in_entryRuleClickOn577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClickOn587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleClickOn624 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleSelector_in_ruleClickOn645 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleClickOn657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelector_in_entryRuleSelector693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelector703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSelector740 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSelector757 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSelector774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFill_in_entryRuleFill810 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFill820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleFill857 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleSelector_in_ruleFill878 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFill890 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleValue_in_ruleFill911 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFill923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheck_in_entryRuleCheck959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheck969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleCheck1006 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleSelector_in_ruleCheck1027 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCheck1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUncheck_in_entryRuleUncheck1075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUncheck1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleUncheck1122 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleSelector_in_ruleUncheck1143 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUncheck1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLet_in_entryRuleLet1191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLet1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleLet1238 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLet1255 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleLet1272 = new BitSet(new long[]{0x0000000000008070L});
    public static final BitSet FOLLOW_ruleLetValue_in_ruleLet1293 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleLet1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLetValue_in_entryRuleLetValue1341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLetValue1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelector_in_ruleLetValue1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleLetValue1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValue1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleValue1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValue1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExp_in_entryRuleBooleanExp1609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExp1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleBooleanExp1665 = new BitSet(new long[]{0x00000000F0400000L});
    public static final BitSet FOLLOW_ruleOperator_in_ruleBooleanExp1686 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleValue_in_ruleBooleanExp1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleBrowser1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleBrowser1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleBrowser1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleBrowser1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleBrowser1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOperator1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOperator1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOperator1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOperator1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOperator1940 = new BitSet(new long[]{0x0000000000000002L});

}