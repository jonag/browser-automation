package org.joclal.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.joclal.browserAutomation.BooleanExp;
import org.joclal.browserAutomation.BrowserAutomationPackage;
import org.joclal.browserAutomation.Check;
import org.joclal.browserAutomation.ClickOn;
import org.joclal.browserAutomation.DoWhile;
import org.joclal.browserAutomation.Fill;
import org.joclal.browserAutomation.Goto;
import org.joclal.browserAutomation.IfThen;
import org.joclal.browserAutomation.Let;
import org.joclal.browserAutomation.LetValue;
import org.joclal.browserAutomation.Model;
import org.joclal.browserAutomation.Selector;
import org.joclal.browserAutomation.Uncheck;
import org.joclal.browserAutomation.Value;
import org.joclal.services.BrowserAutomationGrammarAccess;

@SuppressWarnings("all")
public class BrowserAutomationSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BrowserAutomationGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == BrowserAutomationPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case BrowserAutomationPackage.BOOLEAN_EXP:
				if(context == grammarAccess.getBooleanExpRule()) {
					sequence_BooleanExp(context, (BooleanExp) semanticObject); 
					return; 
				}
				else break;
			case BrowserAutomationPackage.CHECK:
				if(context == grammarAccess.getActionRule() ||
				   context == grammarAccess.getCheckRule()) {
					sequence_Check(context, (Check) semanticObject); 
					return; 
				}
				else break;
			case BrowserAutomationPackage.CLICK_ON:
				if(context == grammarAccess.getActionRule() ||
				   context == grammarAccess.getClickOnRule()) {
					sequence_ClickOn(context, (ClickOn) semanticObject); 
					return; 
				}
				else break;
			case BrowserAutomationPackage.DO_WHILE:
				if(context == grammarAccess.getDoWhileRule()) {
					sequence_DoWhile(context, (DoWhile) semanticObject); 
					return; 
				}
				else break;
			case BrowserAutomationPackage.FILL:
				if(context == grammarAccess.getActionRule() ||
				   context == grammarAccess.getFillRule()) {
					sequence_Fill(context, (Fill) semanticObject); 
					return; 
				}
				else break;
			case BrowserAutomationPackage.GOTO:
				if(context == grammarAccess.getActionRule() ||
				   context == grammarAccess.getGotoRule()) {
					sequence_Goto(context, (Goto) semanticObject); 
					return; 
				}
				else break;
			case BrowserAutomationPackage.IF_THEN:
				if(context == grammarAccess.getIfThenRule()) {
					sequence_IfThen(context, (IfThen) semanticObject); 
					return; 
				}
				else break;
			case BrowserAutomationPackage.LET:
				if(context == grammarAccess.getActionRule() ||
				   context == grammarAccess.getLetRule()) {
					sequence_Let(context, (Let) semanticObject); 
					return; 
				}
				else break;
			case BrowserAutomationPackage.LET_VALUE:
				if(context == grammarAccess.getLetValueRule()) {
					sequence_LetValue(context, (LetValue) semanticObject); 
					return; 
				}
				else break;
			case BrowserAutomationPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case BrowserAutomationPackage.SELECTOR:
				if(context == grammarAccess.getSelectorRule()) {
					sequence_Selector(context, (Selector) semanticObject); 
					return; 
				}
				else break;
			case BrowserAutomationPackage.UNCHECK:
				if(context == grammarAccess.getActionRule() ||
				   context == grammarAccess.getUncheckRule()) {
					sequence_Uncheck(context, (Uncheck) semanticObject); 
					return; 
				}
				else break;
			case BrowserAutomationPackage.VALUE:
				if(context == grammarAccess.getValueRule()) {
					sequence_Value(context, (Value) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (leftMember=Value operator=Operator rightMember=Value)
	 */
	protected void sequence_BooleanExp(EObject context, BooleanExp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserAutomationPackage.Literals.BOOLEAN_EXP__LEFT_MEMBER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserAutomationPackage.Literals.BOOLEAN_EXP__LEFT_MEMBER));
			if(transientValues.isValueTransient(semanticObject, BrowserAutomationPackage.Literals.BOOLEAN_EXP__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserAutomationPackage.Literals.BOOLEAN_EXP__OPERATOR));
			if(transientValues.isValueTransient(semanticObject, BrowserAutomationPackage.Literals.BOOLEAN_EXP__RIGHT_MEMBER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserAutomationPackage.Literals.BOOLEAN_EXP__RIGHT_MEMBER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanExpAccess().getLeftMemberValueParserRuleCall_0_0(), semanticObject.getLeftMember());
		feeder.accept(grammarAccess.getBooleanExpAccess().getOperatorOperatorEnumRuleCall_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getBooleanExpAccess().getRightMemberValueParserRuleCall_2_0(), semanticObject.getRightMember());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     checkbox=Selector
	 */
	protected void sequence_Check(EObject context, Check semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserAutomationPackage.Literals.CHECK__CHECKBOX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserAutomationPackage.Literals.CHECK__CHECKBOX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCheckAccess().getCheckboxSelectorParserRuleCall_1_0(), semanticObject.getCheckbox());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     selector=Selector
	 */
	protected void sequence_ClickOn(EObject context, ClickOn semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserAutomationPackage.Literals.CLICK_ON__SELECTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserAutomationPackage.Literals.CLICK_ON__SELECTOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getClickOnAccess().getSelectorSelectorParserRuleCall_1_0(), semanticObject.getSelector());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (actions+=Action* condition=BooleanExp)
	 */
	protected void sequence_DoWhile(EObject context, DoWhile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (field=Selector value=Value)
	 */
	protected void sequence_Fill(EObject context, Fill semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserAutomationPackage.Literals.FILL__FIELD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserAutomationPackage.Literals.FILL__FIELD));
			if(transientValues.isValueTransient(semanticObject, BrowserAutomationPackage.Literals.FILL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserAutomationPackage.Literals.FILL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFillAccess().getFieldSelectorParserRuleCall_1_0(), semanticObject.getField());
		feeder.accept(grammarAccess.getFillAccess().getValueValueParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     url=Value
	 */
	protected void sequence_Goto(EObject context, Goto semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserAutomationPackage.Literals.GOTO__URL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserAutomationPackage.Literals.GOTO__URL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGotoAccess().getUrlValueParserRuleCall_1_0(), semanticObject.getUrl());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (condition=BooleanExp thenActions+=Action* elseActions+=Action*)
	 */
	protected void sequence_IfThen(EObject context, IfThen semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (selector=Selector | value=Value)
	 */
	protected void sequence_LetValue(EObject context, LetValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=LetValue)
	 */
	protected void sequence_Let(EObject context, Let semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserAutomationPackage.Literals.LET__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserAutomationPackage.Literals.LET__NAME));
			if(transientValues.isValueTransient(semanticObject, BrowserAutomationPackage.Literals.LET__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserAutomationPackage.Literals.LET__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLetAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getLetAccess().getValueLetValueParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (browser=Browser firstGoTo=Goto actions+=Action*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     id=STRING
	 */
	protected void sequence_Selector(EObject context, Selector semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserAutomationPackage.Literals.SELECTOR__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserAutomationPackage.Literals.SELECTOR__ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSelectorAccess().getIdSTRINGTerminalRuleCall_1_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     checkbox=Selector
	 */
	protected void sequence_Uncheck(EObject context, Uncheck semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BrowserAutomationPackage.Literals.UNCHECK__CHECKBOX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserAutomationPackage.Literals.UNCHECK__CHECKBOX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUncheckAccess().getCheckboxSelectorParserRuleCall_1_0(), semanticObject.getCheckbox());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (string=STRING | int=INT | let=[Let|ID])
	 */
	protected void sequence_Value(EObject context, Value semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
