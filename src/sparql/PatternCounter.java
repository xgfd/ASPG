package sparql;

import org.apache.jena.sparql.algebra.OpVisitor;
import org.apache.jena.sparql.algebra.op.*;

/**
 * Created by xgfd on 01/03/2016.
 */
public class PatternCounter implements OpVisitor {

    private int count = 0;

    public int getCount() {
        return count;
    }

    @Override
    public void visit(OpBGP opBGP) {
        count += opBGP.getPattern().size();
    }

    @Override
    public void visit(OpQuadPattern opQuadPattern) {
        count+= opQuadPattern.getPattern().size();
    }

    @Override
    public void visit(OpQuadBlock opQuadBlock) {

    }

    @Override
    public void visit(OpTriple opTriple) {

    }

    @Override
    public void visit(OpQuad opQuad) {

    }

    @Override
    public void visit(OpPath opPath) {

    }

    @Override
    public void visit(OpTable opTable) {

    }

    @Override
    public void visit(OpNull opNull) {

    }

    @Override
    public void visit(OpProcedure opProcedure) {

    }

    @Override
    public void visit(OpPropFunc opPropFunc) {

    }

    @Override
    public void visit(OpFilter opFilter) {

    }

    @Override
    public void visit(OpGraph opGraph) {

    }

    @Override
    public void visit(OpService opService) {

    }

    @Override
    public void visit(OpDatasetNames opDatasetNames) {

    }

    @Override
    public void visit(OpLabel opLabel) {

    }

    @Override
    public void visit(OpAssign opAssign) {

    }

    @Override
    public void visit(OpExtend opExtend) {

    }

    @Override
    public void visit(OpJoin opJoin) {

    }

    @Override
    public void visit(OpLeftJoin opLeftJoin) {

    }

    @Override
    public void visit(OpUnion opUnion) {

    }

    @Override
    public void visit(OpDiff opDiff) {

    }

    @Override
    public void visit(OpMinus opMinus) {

    }

    @Override
    public void visit(OpConditional opConditional) {

    }

    @Override
    public void visit(OpSequence opSequence) {

    }

    @Override
    public void visit(OpDisjunction opDisjunction) {

    }

    @Override
    public void visit(OpExt opExt) {

    }

    @Override
    public void visit(OpList opList) {

    }

    @Override
    public void visit(OpOrder opOrder) {

    }

    @Override
    public void visit(OpProject opProject) {

    }

    @Override
    public void visit(OpReduced opReduced) {

    }

    @Override
    public void visit(OpDistinct opDistinct) {

    }

    @Override
    public void visit(OpSlice opSlice) {

    }

    @Override
    public void visit(OpGroup opGroup) {

    }

    @Override
    public void visit(OpTopN opTopN) {

    }
}
