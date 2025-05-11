package hello.core.member;

public class MemberServiceImpl implements MemberService {

    //추상화에만 의존 -> 구현내용은 생성자 주입 통해 별도
    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
