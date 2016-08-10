package com.kitesquotes.itychanged.kitesquotes;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.kitesquotes.itychanged.kitesquotes.Day.DataforDayActivity;
import com.kitesquotes.itychanged.kitesquotes.Day.DetailActivity;
import com.kitesquotes.itychanged.kitesquotes.Day.model.OPhoto;

import java.util.ArrayList;
import java.util.List;

import link.fls.swipestack.SwipeStack;

public class MainActivity extends AppCompatActivity implements SwipeStack.SwipeStackListener, View.OnClickListener {

    private Button mButtonLeft, mButtonRight;
    private FloatingActionButton mFab;

    private ArrayList<OPhoto> mData;
    private SwipeStack mSwipeStack;
    private SwipeStackAdapter mAdapter;
    com.github.clans.fab.FloatingActionButton fab01,fab02,fab03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSwipeStack = (SwipeStack) findViewById(R.id.swipeStack);
        mButtonLeft = (Button) findViewById(R.id.buttonSwipeLeft);
        mButtonRight = (Button) findViewById(R.id.buttonSwipeRight);
        mFab = (FloatingActionButton) findViewById(R.id.fabAdd);

        mButtonLeft.setOnClickListener(this);
        mButtonRight.setOnClickListener(this);
        mFab.setOnClickListener(this);

        mData = new ArrayList<>();
        mAdapter = new SwipeStackAdapter(mData);
        mSwipeStack.setAdapter(mAdapter);
        mSwipeStack.setListener(this);
        fab01= (com.github.clans.fab.FloatingActionButton) findViewById(R.id.fab1);
        fab01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        fab02= (com.github.clans.fab.FloatingActionButton) findViewById(R.id.fab2);
        fab02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        fab03= (com.github.clans.fab.FloatingActionButton) findViewById(R.id.fab3);
        fab03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,DataforDayActivity.class);
                startActivity(intent);
            }
        });



        fillWithTestData();
    }

    private void fillWithTestData() {
            mData.add(new OPhoto("http://66.media.tumblr.com/a062d089f60cb0fbf196744f0bb663cb/tumblr_obldq6uCVD1sxnbwko1_1280.png","“Novaturiend (adj) \n" +
                    "Khao khát muốn thay đổi cuộc sốn một cách mãnh liệt.\n" +
                    "(trích Chuyện - Wordporn)”\n" +
                    "- Cảm giác này thường đến khi bạn nhận ra rằng, cái cuộc sống mà bạn đang sống nó vô nghĩa, chán nản làm sao, và bạn chỉ muốn bứt khỏi nó\n" +
                    "- Ngoài kia chắc chắn đang có 1 cuộc sống khác đang chờ bạn\n" +
                    "- Bạn có thể bắt đầu sự thay đổi bằng 1 chuyến đi. Đi đâu cũng được.\n" +
                    "- Đã đến lúc phải lên đường rồi."));
            mData.add(new OPhoto("http://66.media.tumblr.com/2fd34561f885ebf0766715188d101283/tumblr_o0hlzxBcp21sxnbwko1_1280.png","“Một thời Yahoo\n" +
                    "1. Nhớ nhất chat room. Mấy đứa cứ add nhau vào rồi có bao giờ nói chuyện tử tế đâu. Toàn nhảy vào 222222 xong trả lời 33333 như bọn điên, chưa kể còn ném một đống icon vào để trêu nhau, thế mà cũng ngồi cười cả đêm cho được.\n" +
                    "2. Hồi đấy hình như dây thần kinh xấu hổ bị đứt hay sao ấy nhỉ? Nick chat cứ phải là co_be_doi_hon; Duc_lang_tu…; an_may_di_vang; trai_tim_co_don… Giờ nhắc lại cứ sởn cả da gà da vịt da trâu.\n" +
                    "3. Webcam thì mờ tìn tịt, có được như smartphone hay laptop bây giờ đâu. Thế cho nên đứa nào hot mà mở webcam là y như rằng 1-2 phút sau sẽ có cả đống request. Mấy cái avatar chụp chân dung mờ mờ, ảo ảo cũng từ đây mà ra cả. Cơ mà thời đó như thế là hot lắm rồi!!!\n" +
                    "4. Tán tỉnh qua Yahoo mới đúng là truân chuyên nè. Màn hỏi nick thực sự rất cam go, bởi không dễ như Facebook bây giờ, nhấp vào tìm kiếm gõ tên là có khi ra luôn. Hồi đó thích ai thì phải dò la, đút lót cả tuần trời mới được cái nick. Hồi hộp add, rồi thấp thỏm chờ được accept nữa… ôi nhớ lại vẫn đau tim!\n" +
                    "5. Muốn gây sự chú ý với đứa nào là cứ available rồi invisible liên tục, liên tục. Tràn cả màn hình nhưng không biết nó có chú ý không?\n" +
                    "6. Đến giờ vẫn ghét mấy đứa cười kiểu hai chấm ngoặc đơn nhé! Biểu tượng cảm xúc smile đúng là cái emoticon khốn nạn nhất hệ mặt trời.\n" +
                    "7. Có ai nhớ mấy cái phông nền chat hồi đó không? Tiếng buzz của mỗi loại phông cũng sinh động chẳng kém.\n" +
                    "8. Qua rồi nhưng vẫn còn ức lắm, chả hiểu sao cứ vào hàng net là bị kêu hư hỏng? Chỉ vào chat Yahoo với nhau thôi mà…\n" +
                    "9. Mấy lúc tâm trạng cũng hì hục đăng lời bài hát hết cho nó “so deep”. Mà nhiều nhất vẫn là mấy câu nói ỡm ờ để cái đứa cần hiểu đọc được mà thôi!\n" +
                    "10. Học được cách chèn link vào dòng status là y như rằng tìm đủ bài hát để chèn cho bằng được.\n" +
                    "11. Cái âm thanh buzz nghe nó vừa hoành tráng lại vừa sexy thế nào ý nhỉ? Chả thế mà các con giời cứ buzz gọi nhau điên cuồng, nghe cũng sướng tai =)).\n" +
                    "12. À, có mấy đứa hay tỏ vẻ bí hiểm bằng cách lúc nào cũng để invisible vì “không muốn bị làm phiền”. Xời, có ma nào buzz đâu, rõ ảo tưởng.\n" +
                    "13. Có trò này nè…\n" +
                    "B *.* *.* *.* *.* *.* *.* *.* *.* \n" +
                    "C *.* * *.* *.* * *.* \n" +
                    "D *.* Tình_Yêu *.* *.* Bat_Tu *.* \n" +
                    "E *.* T *.* ™Yêu™ *.* H *.*\n" +
                    "F *.* *.* *.*Em*.* *.* *.* \n" +
                    "G *.* ™Nhiêu™ *.*\n" +
                    "14. Thích nhất cảm giác lúc ngủ dậy thấy một đống Message archive được nhận từ đêm qua hihi.\n" +
                    "15. Ôi ngày xưa tán thằng nào mà sáng ra nhận được tin nhắn của nó trên Y!M là cả ngày sướng mê tơi, đầu với óc không còn hoạt động bình thường nữa…\n" +
                    "16. Cảm giác chờ mãi 1 cái nick sáng, rồi chờ cái nick đó buzz mình, cố availble để nó nhảy vào trước nhưng rồi người bắt chuyện lại là mình… thật thốn biết bao…“"));
                mData.add(new OPhoto("http://67.media.tumblr.com/11b38fa65d4d87e4571f0a660f4d0b00/tumblr_ob9remoyFC1sxnbwko1_1280.png",""));
                mData.add(new OPhoto("http://66.media.tumblr.com/8e3aa76f8dbf7598aa912023f6ea6d60/tumblr_ob9qu5I4fW1sxnbwko1_1280.png","Điều gì làm mất đi tình bạn?\n" +
                        "1. Đó là khi tôi tỏ tình với nó. Bạn tốt nhiều năm chỉ vì một lúc không cầm lòng được thế là mất.\n" +
                        "2. Chỉ biết lợi dụng tôi.\n" +
                        "3. Lúc có niềm vui thì nó không bao giờ nhớ đến tôi, đến khi bản thân có chuyện thì mới nhớ. Tôi chỉ có nó, cũng bỏ ra rất nhiều cho tình bạn này, nhưng tôi nhận ra tôi không phải là người quan trọng với nó nhất.\n" +
                        "4. Tin nhắn tôi gửi không rep thế mà lại trả lời cmt của bạn mới.\n" +
                        "5. Nó làm tôi mất mặt trước bạn bè rất nhiều lần, cứ lấy tôi ra làm trò hề, tôi thấy mọi người cười kể cả nó, nhưng tôi lại đặc biệt cực kỳ khó chịu. Mọi người có hiểu cảm giác này không?\n" +
                        "6. Tôi với nó hứa với nhau sẽ làm cẩu FA mãi mãi, thế mà nó lại có bạn trai.. như vậy có gọi là phản bội không?\n" +
                        "7. Đừng bao giờ giới thiệu bồ với bạn thân quen biết nhau. Khuyên chân thành mấy má.\n" +
                        "8. Nó lấy tôi ra đùa thì được, còn tôi lấy nó ra đùa nó lại giận tôi.\n" +
                        "9. Nó chỉ biết mỗi mình nó, không suy nghĩ đến người khác.\n" +
                        "10. Bạn bè cũng như vòng một. Người thiệt bự, người không có tí nào. Người đồ thiệt, người xài hàng giả.\n" +
                        "11. Bạn thân? Hai từ này có tin được không vậy?\n" +
                        "12. Nói thật, tôi còn không biết lý do tại sao nữa.\n" +
                        "13. Tôi rủ nó đi chơi, nó đồng ý. Đến ngày gần đi nó bảo không đi được. Đến tối thì tôi thấy nó check-in với bạn của của nó.\n" +
                        "14. Chụp hình 2 đứa nó pts mỗi mình nó. Hỡi thần linh, tình bạn ở đâuuuuuuuu?\n" +
                        "15. Nó cứ hay so đo với tôi từ điểm kiểm tra đến tiền bạc.\n" +
                        "16. Đụng đến idol của tôi.\n" +
                        "17. Tự dưng im lặng, tự dưng kết thúc.\n" +
                        "18. Đó là khi tôi biết bộ mặt thật của nó.\n" +
                        "19. Nó có bạn mới.\n" +
                        "20. Thiếu sự tin tưởng. Nó có quá nhiều điều giấu tôi."));
                mData.add(new OPhoto("http://65.media.tumblr.com/f6a55e9b02e7d0f34768572dcc890869/tumblr_oawvl7JDZR1sxnbwko1_1280.png","“Đành là thời gian có thể xoá nhoà tất cả, nhưng nếu nỗi nhớ của bạn về ai đó sâu đậm đến mức thời gian không thể xoá đi, thì người đó chính là người hạnh phúc nhất trên thế gian này, còn bạn chính là người đau khổ nhất trên thế gian… ”\n" +
                        "\n" +
                        "{Phim Tâm chiến - Master Of Play (2012)}"));
                mData.add(new OPhoto("http://66.media.tumblr.com/82134a10f20bea4e6c6fadc666514698/tumblr_oawvk0srP31sxnbwko1_1280.png","“Rất lâu sau đó, tôi mới nhận ra rằng, người ta thường đến với nhau chỉ bằng vài thứ cảm xúc mãnh liệt nhất thời, hệt như pháo bông đêm 30 vậy, rực rỡ trong một thoáng rồi chìm hẳn và bầu trời đêm.”"));
                mData.add(new OPhoto("http://66.media.tumblr.com/b59d1f9570f65012f03b03e7a7ca8815/tumblr_oawviuwGA61sxnbwko1_1280.png","“Đời người, thứ khó chấp nhận nhất chính là việc ta nhận ra rằng sau tất cả mọi cố gắng của bản thân vì một ai đó, một thứ gì đó, thì đến cuối cùng tất cả cũng rời bỏ ta.”"));
                mData.add(new OPhoto("http://67.media.tumblr.com/b777bbf7f35e94f22064be060497168c/tumblr_oawvgy9B141sxnbwko1_1280.png","“Vào mùa xuân năm ấy. Tôi hai mươi tư tuổi. Vẫn chưa hề biết rằng. Vĩnh viễn là một từ ảo tưởng được sinh ra trong nỗi cô đơn."));
                mData.add(new OPhoto("http://66.media.tumblr.com/04b2173c693093e79d7242f21235beec/tumblr_oawvfwILHa1sxnbwko1_1280.png","“Tháng bảy sang trào dâng miền ký ức\n" +
                        "Vòng tay ôm hư thực cả trời yêu\n" +
                        "Để cho lòng thêm nặng nỗi cô liêu\n" +
                        "Chân lẻ bước một mình cùng con phố\n" +
                        "\n" +
                        "Tháng Bảy sang mang bao điều trăn trở\n" +
                        "Tự nhủ lòng mình đã hiểu mình đâu\n" +
                        "Thì mơ gì người sẽ hiểu lòng nhau\n" +
                        "Đợi làm chi khi kẻ đi người ở\n" +
                        "\n" +
                        "Tháng bảy sang ôi ngập tràn nhung nhớ\n" +
                        "Dẫu biết rằng người mãi ở phương xa\n" +
                        "Dù tình kia không còn phút mặn mà\n" +
                        "Hương yêu cũ vẫn nồng trong hơi thở\n" +
                        "\n" +
                        "Tháng bảy sang trái tim như hé mở\n" +
                        "Mong yêu thương theo lối ấy tìm vào\n" +
                        "Cho hương yêu luôn tha thiết ngọt ngào\n" +
                        "Để thấy mình không còn trong đơn độc\n" +
                        "\n" +
                        "Tháng bảy sang sao nghẹn ngào muốn khóc\n" +
                        "Mong người xưa cùng chung bước lối về\n" +
                        "Để nhớ nhung không còn mãi lê thê\n" +
                        "Để được sống trong êm đềm hạnh phúc.”\n" +
                        "\n" +
                        "{Nỗi niềm tháng bảy | Nguyễn Quang Long}"));
                mData.add(new OPhoto("http://66.media.tumblr.com/8582664aa398c8c23737f763869ec8ef/tumblr_oawvdrCRQV1sxnbwko1_1280.png","“Tình cảm là đôi giày, vừa chân ai nấy xỏ.\n" +
                        "Không phải của mình đừng dòm ngó mất công.”"));
                mData.add(new OPhoto("http://67.media.tumblr.com/2ecc454566c8402fde4c47d07d7e941f/tumblr_oawvcngmvI1sxnbwko1_1280.png","“If I’d have said I love you, she’d have said it back. And then everything would have been different. I might have saved her… I might have found a way to keep her from her fate.”\n" +
                        "\n" +
                        "“Nếu tôi nói Tôi yêu em, cô ấy cũng sẽ đáp lại y như thế. Và sau đó, mọi chuyện sẽ đi theo một chiều hướng khác. Tôi đã có thể cứu được cô ấy, tôi đã có thể tìm được cách giành lấy cô ấy từ số mệnh nghiệt ngã kia.”"));
                mData.add(new OPhoto("http://67.media.tumblr.com/7c3d96a0b3a77e5621208367c6f0f3db/tumblr_oacsfnrWC21sxnbwko1_1280.png","“Thế hệ của chúng ta chẳng biết nhiều về tình yêu.\n" +
                        "Chúng ta muốn một tách cà phê trên tay, ngắm đường xá ngắm người ngợm thong thả trong một sáng Thứ Bảy lười biếng. Chúng ta muốn một đôi giày mới tinh tươm ẩn hiện trên tấm ảnh chất nghệ hàng trăm like trên Instagram. Chúng ta muốn một dòng thông báo trạng thái hẹn hò được công bố trên Facebook để người người, nhà nhà, cả quen cả không quen, xúm vào chúc mừng và đặt nhiều câu hỏi hoài nghi về đối tượng mà chúng ta giấu giếm.\n" +
                        "Chúng ta muốn, kể cả khi người yêu mình không xuất hiện trên các tấm hình, dân tình cũng phải ồ à, thán phục, trầm trồ, ca tụng mối quan hệ của bản thân là cái đích cuối cùng cho tình yêu mà họ hằng mong ước.\n" +
                        "Chúng ta muốn hẹn hò vào 10 giờ sáng Chủ Nhật, bên nhau bên một thố bánh mỳ và mấy hộp bơ giữa một nhà hàng nhìn ra mặt đường phố đông người qua. Chúng ta muốn có ai đó sẵn sàng đánh thức mình dậy bằng một tin nhắn đượm chất yêu đương và dịu dàng tinh tế. Chúng ta muốn có một \"plus one” để đi dự đám cưới của những người bạn, chúng ta muốn họ thi nhau hỏi rằng đến bao giờ thì mình mới chịu chính thức lên xe hoa trong khi sân khấu vẫn đang là những lời tuyên thệ của cặp vợ chồng nhân vật chính.\n" +
                        "Nhưng mà thực tế lại chứng minh là, thế hệ chúng ta lại chẳng biết yêu đương.\n" +
                        "Chúng ta lướt ngón tay trong vô vọng nhằm kiếm tìm một người để yêu trên các ứng dụng, trang web hẹn hò. Chúng ta lùng sục khắp mọi cửa hàng sách, mọi ngóc ngách trên Internet đọc về những bài viết kiểu từa tựa “5 cách để làm chàng say mê bạn từ cái nhìn đầu tiên”, “Bí quyết khiến nàng vấn vương mãi không thôi về bạn chỉ sau một buổi hẹn hò”. Chúng ta xem đi xem lại The Note Book, chạy marathon đến hàng chục lần bộ How I Met Your Mother, chúng ta đầu tư vào phần Tự giới thiệu trên các trang hò hẹn hơn là chăm sóc chính con người và tính cách thật của mình.\n" +
                        "Chúng ta mãi cứ mơ mộng viển vông về một tình yêu bất ngờ trên tàu điện, bến xe buýt, chứ không phải một tình yêu tự đi tìm kiếm, một mối quan hệ ràng buộc.\n" +
                        "Chúng ta ngập ngừng nói chuyện, nhắn tin nhiệt tình, gửi hàng chục bức ảnh để “thể hiện tính cách”. Chúng ta lêu hêu, lang thang, đi cà phê, đi nhậu nhẹt, chúng ta làm mọi thứ trong vòng tròn chẳng hề có điểm giao với những buổi hẹn hò. Chúng ta hẹn nhau đi gặp mặt, nói vài ba câu giả tạo rồi về đến nhà ôm máy điện thoại nhắn với nhau hàng tỷ thứ tin nhắn mà khi ở trước mặt nhau không ai dám mở lời.\n" +
                        "Chúng ta bỏ qua mọi cơ hội đến được với nhau bằng cách lao vào những cuộc thi vô bổ như “Kẻ lãnh đạm nhất”, “Người ở cửa trên”, “Kẻ có cái tôi cao nhất”, “Đàn ông tự tôn lớn nhất”. Cuối cùng cái danh hiệu mà chúng ta nhận được chỉ đơn giản là “Kẻ sau này chắc chắn là cô đơn”.\n" +
                        "Chúng ta là thế hệ thực dụng, chỉ muốn cái hào nhoáng của tình yêu mà không cần biết làm thế nào để cấu thành nên sự hào nhoáng ấy. Chúng ta muốn nắm chặt tay nhau nhưng lại chẳng nhìn vào mắt nhau, chúng ta chỉ muốn nói đùa nói giỡn chứ không thích nói chuyện nghiêm túc, sến rện về nhau. Chúng ta thích những lời hứa hẹn hoa mỹ mà chẳng quan tâm đến sự cam kết thực sự, chúng ta thích tổ chức những lễ kỷ niệm cột mốc mà không màng biết đến việc sẽ phải cố gắng với nhau đến thế nào mới có được dấu mốc ấy.\n" +
                        "Chúng ta muốn sống hạnh phúc đến đầu bạc răng long như những cụ ông, cụ bà trong các tấm ảnh lượm lặt trên Pinterest. Tuy nhiên chúng ta lại chẳng bỏ ra đủ công sức ngay từ lúc này, ngay từ bây giờ. Chúng ta muốn sự kết nối sâu sắc trong khi vẫn cứ giữ thái độ yêu đương nông cạn.\n" +
                        "Chúng ta cần ai đó nắm tay mình nhưng lại chẳng dám đặt niềm tin vào đôi tay ấy, chúng ta sợ tổn thương. Chúng ta thích những lời tán tỉnh mùi mẫn, thế nhưng chúng ta lại sợ bị tán tỉnh. Chúng ta muốn được tự do, muốn được độc lập, muốn đứng trên chính đôi chân của mình. Chúng ta vẫn giữ cho mình lý tưởng về tình yêu, nhưng lại không muốn rơi vào lưới tình thật sự.\n" +
                        "Chúng ta đâu muốn mối quan hệ yêu đương, cái bây giờ chúng ta muốn là các mối quan hệ chơi bời, dứt là dứt, không đau đớn không vật vã. Chúng ta muốn được nhìn thấy viễn cảnh của tình yêu nhưng lại chẳng hề yêu ai. Chúng ta muốn phần thưởng nhưng lại sợ các rủi ro trước mắt, muốn có được món hàng mà không phải trả dù chỉ một đồng lẻ.\n" +
                        "Chúng ta muốn kết nối, chỉ đủ thôi, không quá nhiều. Chúng ta muốn ràng buộc, nhưng chỉ một chút thôi, không được quá sâu đậm. Chúng ta muốn cái gì cũng phải từ từ, nhưng lại quên mất rằng tình yêu như một chõ xôi, để từ từ, để lâu quá, nó sẽ nguội tanh nguội ngắt và khô khốc. Chúng ta ưa thích khái niệm “một mối quan hệ không tên”, chỉ vui vẻ, không có các cung bậc cảm xúc từ dưới đáy đến đỉnh cao.\n" +
                        "Chúng ta lúc nào cũng tìm một phương án B cho chính mình. Chúng ta đặt một chân ngoài cửa trong lúc vẫn ôm ấp đối phương thật chặt, chúng ta cố tình mở một mắt khi vẫn đang hôn nhau đắm đuối. Chúng ta thủ sẵn cho mình một người khác phòng hờ khi mối quan hệ hiện tại thất bại. Chúng ta thích đùa nghịch với cảm xúc của người khác, nhưng lại sửng cồ khi mình phải chịu điều tương tự.\n" +
                        "Khi mà mọi thứ bắt đầu trở nên thật hơn, không chỉ còn đơn giản là vui chơi hò hẹn, chúng ta lại có xu hướng tháo chạy. Chúng ta trốn tránh. Chúng ta hèn hạ bỏ đi. Chúng ta giữ quan niệm rằng đại dương còn hàng tỷ con cá khác, thiếu gì cơ hội tìm kiếm tình yêu, không bây giờ thì lúc khác. Nhưng hàng tỷ con cá ấy không dành cho một mình chúng ta, thế thôi.\n" +
                        "Chúng ta luôn muốn mình là trung tâm của mối quan hệ. Chúng ta thích có người cúi xuống buộc dây giày cho mình khi đang trên phố đi bộ, chúng ta muốn khi đi du lịch, người kia sẽ pack đồ cho mình, kiểu “em chỉ cần hưởng thụ, mọi việc cứ để anh”, chúng ta lại muốn khi đi về sẽ có người unpack hành lý tiếp cho mình. Chúng ta không muốn hy sinh, chúng ta không muốn tốn công tốn sức.\n" +
                        "Chúng ta có xu hướng giấu tiệt những điều xấu xí đằng sau vỏ bọc hoàn hảo. Chúng ta che đậy sự thật không mấy hạnh phúc đằng sau những lớp filter của VSCO, chúng ta thà ngồi bàn luận về The Face, về Mai Ngô hay An Nguy chứ không thích có một cuộc hội thoại thật sự giữa hai người. Chúng ta tôn thờ chủ nghĩa yêu bằng cả trái tim, yêu cả những khuyết điểm sai sót của kẻ khác trong khi vẫn cố giấu mớ xiên xẹo của mình sâu trong cái hòm cất ở gác xép, nhất quyết không bao giờ dám phơi bày với bất kỳ ai.\n" +
                        "Chúng ta muốn mình là người cao thượng trong mối quan hệ.\n" +
                        "Chúng ta xem hàng chục bộ phim hoạt hình cổ tích của Disney thời còn bé và ôm ấp viễn cảnh hạnh phúc về các hoàng tử công chúa cho đến khi trưởng thành, trong khi chẳng nhận thức được rằng mình là dân đen, mà dân đen thì phải cố gắng gấp nhiều lần. Chúng ta cứ mãi hậm hực tại sao vẫn chưa thể tìm ra Bạch mã Hoàng tử của đời mình, Công chúa Lọ Lem của mình ở tít tận đâu, trong khi về cơ bản chúng ta chỉ đang dừng ở mức nhân vật phụ tồn tại trong 2, 3 khung hình.\n" +
                        "Chúng ta chỉ cần một nơi dừng chân, chứ không phải một người để đi hết cả đời. Chúng ta cần một cơ thể ấm để ôm mà ngủ, chứ không phải người để yêu. Chúng ta cần một người ngồi bên cạnh mình để cùng cuộn màn hình lướt News Feed, hay cắm mặt vào một ứng dụng nào đó mà không phải là đời.\n" +
                        "Chúng ta ngồi bàn luận sôi nổi với nhau về những ràng buộc, những quy tắc trong mối quan hệ yêu đương nhưng chẳng ai nghiêm túc thực hiện nguyên tắc ấy. Chúng ta dễ dàng khuyên nhau hãy bỏ thằng ấy/ con ấy đi vì nó không xứng đáng với mày, trong khi chưa bao giờ động viên bạn bè hãy cố gắng một chút, nhường nhịn một chút để hài hòa tương hợp. Chúng ta tự biến mình thành các chuyên gia tâm lý với chỉ độc mỗi phương pháp là dứt áo ra đi.\n" +
                        "Chúng ta dễ dàng chỉ trích lẫn nhau, đổ lỗi cho nhau khi gặp chuyện trúc trắc. Thế nhưng đến lúc yên bình, chẳng ai dám mở lời nói những câu ngọt ngào với nhau. Chúng ta sợ sến chết đi được.\n" +
                        "Cũng bởi những vấn đề được nêu lên phía trên, hình như thế hệ chúng ta chẳng biết yêu đương thật sự là thế nào thì phải?“"));
                mData.add(new OPhoto("http://66.media.tumblr.com/66b03b5409b997d283f9b9b1bd8b45de/tumblr_ncm33wwKyQ1thiwtjo1_r2_1280.png","“Bạn buồn, rủ mình đi ra quán\n" +
                        "Chiều mưa lất phất dọc bờ kè\n" +
                        "Chán nỗi rượu bia mình dị ứng\n" +
                        "Bạn ngồi độc ẩm, có người nghe\n" +
                        "\n" +
                        "Bạn kể mình nghe chuyện tình yêu\n" +
                        "Mình nghe cũng chẳng hiểu bao nhiêu\n" +
                        "Chỉ biết đại khái rằng: tan vỡ\n" +
                        "Và nay bạn vẫn nhớ thương nhiều\n" +
                        "\n" +
                        "Bạn uống tràn ly rồi bạn say\n" +
                        "Bạn khóc, bạn cười như dại ngây\n" +
                        "Mình lau nước mắt trên mặt bạn\n" +
                        "Thương quá là thương những lúc này\n" +
                        "\n" +
                        "Mình ước gì mình cũng biết say\n" +
                        "Cũng khóc cười như thể dại ngây\n" +
                        "Nghe bạn, mình bỗng đau chuyện cũ\n" +
                        "Đau suốt từ xưa, đau đến nay\n" +
                        "\n" +
                        "Bạn dựa vai mình, ngẩn nhìn mưa\n" +
                        "Con kênh đen đục chảy lờ đờ\n" +
                        "Nước mắt bạn khô, vai mình ướt\n" +
                        "Mình tỉnh mà say, say bất ngờ.”"));
                mData.add(new OPhoto("http://67.media.tumblr.com/3e4a46aacaa83b6471905643a416d8b2/tumblr_oa7atxhtSp1sxnbwko1_1280.png","“Chuyến đi cuộc đời có quá nhiều ngã rẽ, để quay lại có lẽ cũng mất cả một đời. Tại ngã rẽ này, chúng ta quen nhau. Tới ngã rẽ tiếp theo, có thể đã trở thành người xa lạ.”"));
                mData.add(new OPhoto("http://67.media.tumblr.com/854658b71ba17ee82caeec83e953a461/tumblr_oa7asexDCX1sxnbwko1_1280.png","“Có những người rất quan trọng với ta, nhưng bỗng chốc lại biến mất khỏi cuộc đời ta không dấu tích, không thể tìm họ được ở bất cứ nơi nào cả, khiến cho ta cứ ôm mãi một câu hỏi: ‘Rốt cuộc, mình đã làm sai điều gì?’”\n"));
                mData.add(new OPhoto("http://67.media.tumblr.com/3c0830bb28be66923bc14b0390babc44/tumblr_oa52xxkEnu1sxnbwko1_1280.png","“Nếu đã quyết tâm làm một chuyện gì đó, đừng vội vàng công bố ra, cũng đừng làm lớn chuyện, cứ như vậy im lặng thực hiện. Bởi vì đó chỉ là chuyện của bạn, người khác không rõ hoàn cảnh của bạn, cũng không thể giúp bạn thực hiện giấc mơ. Ngàn vạn lần đừng vì hư vinh mà mang ra khoe khoang. Cũng đừng vì một câu đánh giá của người khác mà buông bỏ giấc mơ của chính mình. Thật ra trạng thái tốt nhất là kiên trì với giấc mơ của chính mình, nghe một chút lời khuyên của người đi trước, sai lầm ít một chút. Còn việc có đáng giá hay không, thời gian là câu trả lời tốt nhất.”"));
                mData.add(new OPhoto("http://67.media.tumblr.com/eb4e611b32463bcab7faa20c8950c3d6/tumblr_npsed7QOmI1sxnbwko1_1280.png","“Sometimes you find yourself in the middle of nowhere, and sometimes in the middle of nowhere, you find yourself.\n" +
                        "*Tạm dịch: Đôi lúc ta phát hiện bản thân ta lạc lõng giữa chốn vô định, và đôi lúc giữa chốn vô định ta tìm thấy bản thân mình.“"));
                mData.add(new OPhoto("http://65.media.tumblr.com/cf5a968cdc2ab5d116ce374f18f3998e/tumblr_nows31M9271sxnbwko1_1280.png","“You were red. You liked me ‘cause I was blue. You touched me and suddenly I was a lilac sky and you decided purple just wasn’t for you.”"));
                mData.add(new OPhoto("http://66.media.tumblr.com/9629d2bbaf0aa3020df7e428cca8cab3/tumblr_nqaw3nvCbS1sxnbwko1_1280.png","“We are such stuff\n" +
                        "As dreams are made on,\n" +
                        "And our little life\n" +
                        "Is rounded with a sleep.\n" +
                        "*Dịch: Ta và giấc mộng\n" +
                        "Làm bằng chất liệu như nhau,\n" +
                        "Và cuộc đời ta nhỏ bé\n" +
                        "Hoàn tất bằng một giấc ngủ thôi.”\n" +
                        "{The Tempest - Shakespeare}"));
        mData.add(new OPhoto("http://67.media.tumblr.com/aadeb11b4063fa36a87fa8ea9047e736/tumblr_oa30lvtumi1sxnbwko1_1280.png","“Đại học đã dạy bạn điều gì\n" +
                "1. Đừng bao giờ nhìn một người với ánh mắt cố hữu. Đừng bao giờ coi thường bất kì ai.\n" +
                "2. Trốn tiết, chép bài chưa chắc là không thích học. Có những người có kế hoạch đầy đủ cho mình, đó là bằng lòng bỏ thời gian làm những chuyện mà bản thân cảm thấy có ý nghĩa, dù là học môn này môn kia, tham gia hội này hội kia. Bỏ tiết không gọi là trì trệ, bết bát, cả ngày trốn tiết chơi game, ngủ nướng mới gọi là trì trệ.\n" +
                "3. Sự chênh lệch về thành tích có thể quyết định trong vòng hai tuần cuối cùng của học kì, còn chênh lệch giữa người với người là do 18 tuần còn lại. Nghe có vẻ khoa trương nhưng nó có đạo lý của nó.\n" +
                "4. Tập hình thành ít nhất một thói quen tốt, bạn sẽ được lợi cả cuộc đời, ví dụ như ngủ sớm, dậy sớm, ví dụ như chăm tập thể dục, ví dụ như viết nhật kí…\n" +
                "5. Thực tế hóa mục tiêu, sau đó kiên trì hoàn thành nó.\n" +
                "6. Ý kiến của người khác đương nhiên là quan trọng nhưng không cần sống vì người khác, nhất là những chuyện liên quan đến quyết định của chính bản thân, mong bạn hãy tự làm nó, cũng đừng cả nể, chiều theo ý người khác trong những việc trọng đại.\n" +
                "7. Phải chấp nhận sự thật bạn chỉ là một người bình thường, không phải bạn làm gì cũng có thể thành công, đừng nghĩ chỉ cần cố gắng là sẽ làm được, có những người ngay cả khả năng cố gắng cũng không có.\n" +
                "8. Dù thực sự không thích ngành mình đang học cũng như ngôi trường mình đang học, nhưng cũng phải cam đoan không nợ môn, cố gắng lấy cho được cái bằng, hoặc là học tiếp lên cao, hoặc là đi du học.\n" +
                "9. Phải cố gắng hết sức vào năm nhất thì sang năm hai mới đường mà lựa chọn.\n" +
                "10. Tiếng Anh thực sự rất quan trọng.\n" +
                "11. Đừng bao giờ lười. Vừa lười một cái là được tặng kèm cả đống mụn, và cả đống tính từ miêu tả sau tên như: xấu, béo, ngốc…\n" +
                "12. Những việc được lên kế hoạch quá kỹ càng bạn sẽ chẳng bao giờ hoàn thành được. Vậy nên là thích thì làm thôi. Cho dù là lúc nào vẫn chưa muộn. Vậy nên là thích thì làm thôi.\n" +
                "13. Luôn có người đẹp hơn bạn, thông minh hơn bạn, dáng đẹp hơn bạn, giàu hơn bạn, có chỗ dựa hơn bạn, tài hoa hơn bạn, hài hước hơn bạn, hào hoa hơn bạn, vậy nên không cần so sánh, hãy cứ là chính mình.\n" +
                "14. Ở cấp nào cũng vậy, kiến thức luôn rất quan trọng. Dù sau này đi làm cần kỹ năng nhiều hơn là lý thuyết suông, nhưng bạn vẫn phải đảm bảo mình có đủ kiến thức.\n" +
                "15. Đừng bao giờ trốn những môn như Toán, Anh, Tin học cơ bản… Bởi vì dù sau này bạn có làm gì thì vẫn cần đến chúng.\n" +
                "16. Hoạt động đoàn hội tích cực là tốt, nhưng không nhất thiết phải tham gia hết câu lạc bộ này đến câu lạc bộ khác. Chọn một hai nơi để trải nghiệm là đủ rồi.\n" +
                "17. Xác định hướng đi của mình sớm một chút. Năm hai là bắt đầu suy nghĩ xem tương lai mình sẽ làm gì: Học cao học? Xuất ngoại? Đi làm? Mỗi một con đường đều cần những chuẩn bị khác nhau. Trình độ giữa sinh viên thuộc năm nhất, năm hai cơ bản là không quá khác nhau, tất cả mọi người đều lên lớp giống nhau, làm bài tập giống nhau, chương trình học áp lực rất lớn, cơ bản không có thời gian rảnh. Bắt đầu từ năm ba, mọi người sẽ có nhiều thời gian rảnh hơn, cũng có nhiều cơ hội để lựa chọn hơn, vì lúc này, chương trình học là do bạn tự lựa chọn. Năm ba là năm bắt đầu có sự chênh lệch thành tích rõ ràng giữa các sinh viên với nhau, lúc này bạn phải hiểu được con đường mình muốn đi, để có thể chuẩn bị tốt nhất cho nó.\n" +
                "18. Kĩ năng tự học rất quan trọng. Học Đại học rồi, không ai quản bạn có nghe giảng hay không, bạn phải tự biết nghe, sau đó tự học ở nhà. Mà kĩ năng tự học là gì? Nếu khi cả kí túc bạn đứa chơi game, đứa hát hò, bạn vẫn có thể tắt máy tính, nghiêm túc học, vậy bạn đã có kĩ năng tự học. Kĩ năng tự học cũng bao gồm cả khả năng kiềm chế, bạn có thể khống chế mình không hùa theo bạn bè mỗi khi họ chơi đùa.\n" +
                "19. Người khác không thích bạn thì sẽ không thích bạn, chỉ cần bạn có năng lực, tới lúc ấy họ ắt phải nhờ cậy bạn.\n" +
                "20. “Lên Đại học là được chơi thoải mái” - Đây là một trong những câu lừa người kinh điển. Mỗi một giai đoạn đều có áp lực tồn tại, chẳng qua giai đoạn khác nhau, áp lực cũng khác nhau.”"));
        mData.add(new OPhoto("http://66.media.tumblr.com/d38101bb027cddf8c929f0658378642d/tumblr_oa1pv3yiv01sxnbwko1_1280.png","“- Cậu có thường ở một mình như thế không?\n" +
                "- Luôn là thế.\n" +
                "- Cậu thích cô đơn à?\n" +
                "- Không, chẳng ai thích cô đơn cả. Tớ chỉ là không cố kết bạn, vậy thôi.”"));
        mData.add(new OPhoto("http://67.media.tumblr.com/7b28a7c39518c33535ca26c32d74ed55/tumblr_o9zic2eDW11sxnbwko1_1280.png","“Có một số người rất tốt, nhưng nếu không gặp thì còn tốt hơn…”"));
        mData.add(new OPhoto("http://66.media.tumblr.com/0e0cab36f55752d565beef0f2456af2d/tumblr_o9zib2XQiK1sxnbwko1_1280.png","“Trên đời này, tất cả mọi chuyện đều có thể tạm bợ, ngoại trừ kết hôn là không thể. Vì cái bạn cần không phải là một tờ giấy chứng nhận, mà là một cuộc sống sau khi kết hôn. Từ khi cưới đến lúc già, bạn có đến mấy chục năm, rồi hôm nào đó, bạn sẽ không tài nào đối diện với người tạm bợ đó nữa. \n" +
                "Thế nên, cuộc sống chính là, thà rằng cô đơn còn hơn tạm bợ.”"));
        mData.add(new OPhoto("http://67.media.tumblr.com/a79b73a869fff5d126d828a2b6447616/tumblr_o9vijvE6GD1sxnbwko1_1280.png","“Rớt đại học không phải là chuyện dễ dàng gì. \n" +
                "Sẽ rất là xạo xạo nếu như nói việc đó không có đau khổ.\n" +
                "Nhưng mà quan trọng là cách đối mặt với nó như thế nào sẽ quyết định bạn là ai sau cơn khủng hoảng đó. \n" +
                "Thất bại đó không thể quật ngã người ta một cách dễ dàng được. \n" +
                "Vấp ngã đâu có nghĩa là hổng trầy da, mà trầy da nghĩa là có rướm máu, có đau rát và xót xa.\n" +
                "Nhưng mà nhanh thôi vết thương sẽ lại lành, cho dù có để lại sẹo thì mỗi một vết sẹo là chiến tích cho một lần trưởng thành.\n" +
                "Qua thời gian sẽ là kỷ niệm mà lúc nhìn ngắm chúng ta tự hào.”"));
        mData.add(new OPhoto("http://67.media.tumblr.com/27a6988d54d1f490abb2f3319cfbe2b0/tumblr_nmoyn0XLR71sxnbwko1_1280.jpg","“Đừng nói ai biết về rắc rối của bạn. 20% trong số họ không thèm quan tâm đâu, 80% còn lại thì rất mừng khi bạn gặp phải chúng.”"));
        mData.add(new OPhoto("http://67.media.tumblr.com/d79b2675a325c5aaf36211fbb1e6bfea/tumblr_n0kva5L01I1sxnbwko1_1280.png","“Đừng bao giờ uống rượu để nhấn chìm nỗi buồn, vì biết đâu nỗi buồn có thể biết bơi”"));
        mData.add(new OPhoto("http://66.media.tumblr.com/6fd85d5e276216ec27a4e25e1d3500df/tumblr_o3ythhXj0a1sxnbwko1_1280.png","“Mẹ nói, chỉ cần tôi ngoan ngoãn nhận lỗi, bà sau cùng sẽ nắm lấy tay tôi. Người đó nói, không phải cứ biết thừa nhận sai lầm là có thể khiến chúng ta lại nắm tay một lần nữa. Thực ra, cha mẹ sẽ luôn tha thứ, bởi vì bạn là con của họ. Nhưng người yêu thường khó tha thứ, bởi vì chúng ta đều là những đứa con.”"));
        mData.add(new OPhoto("http://66.media.tumblr.com/e4f87b75ef24308a325393150dddebe2/tumblr_o2jghhTVkz1sxnbwko1_1280.png","“Người ấy biến mất rồi. Như thể chưa từng xuất hiện trong cuộc sống của tôi. Chúng ta trở lại như trước kia, không gọi điện thoại, không liên hệ, giống như những người xa lạ. Nhưng chúng ta không thể trở lại thời điểm ban đầu, giống như lời đã nói ra, chẳng thể nào rút lại được.”"));
        mData.add(new OPhoto("http://67.media.tumblr.com/fa29c052349f2b0681e588a2d2b27606/tumblr_nclxwr55Ep1sxnbwko1_r1_1280.png","“Nếu biết bài hát nào nghe vào sẽ buồn thương, thì có thể không nghe nữa. Vậy nếu như biết rõ yêu một người sẽ rất đau lòng, có thể khiến bản thân mình không yêu nữa được không?”"));
        mData.add(new OPhoto("http://67.media.tumblr.com/125aa6dbe7ff3109d42abe29c9543e56/tumblr_nxdrdq6WNW1sxnbwko1_1280.png","“Cô chưa từng sợ người ta bỏ cô mà đi. Cô chỉ lo sợ rằng một ngày nào đó họ xem cô như một điều dĩ nhiên, vốn sẵn có trong đời họ. Cái cảm giác ấy còn đáng sợ hơn ngàn lần.”"));
        mData.add(new OPhoto("http://67.media.tumblr.com/5c44dd44e68ef0b808f55b4efb8f372a/tumblr_n8v1y3KGlp1sxnbwko1_r1_1280.png","“Cô gái nào phải vật lộn ngoài xã hội đều mơ ước sẽ có được một công việc ổn định, còn có một tình yêu tuy rằng rất bình thường nhưng cũng rất hạnh phúc và cả một tình bạn thật đáng quý nữa.\n" +
                "Nhưng mà, trong số đó tình yêu là thứ không đáng tin nhất. \n" +
                "Bởi vì nó chứa nhiều ảo tưởng nhất.”"));
        mData.add(new OPhoto("http://66.media.tumblr.com/cd1ac9c0828e853164a72d14d242f7df/tumblr_o9sgzkG5R61sxnbwko1_1280.png","“Có những người mà ta chỉ nhớ chứ không liên lạc, chỉ quan sát chứ không làm phiền.”\n"));
        mData.add(new OPhoto("http://66.media.tumblr.com/c8fbe8f2c9ac8e9b76d8e023db71ab5a/tumblr_o3etqmBa921sxnbwko1_1280.png","“Mỗi lúc bị người bài xích, bạn đều cho rằng bản thân đã làm sai. Mỗi lúc bị người lăng mạ, lại vì lý do đó mà rầu rĩ mấy ngày trời. Trong cuộc sống, sẽ có không ít người vô duyên vô cớ coi thường bạn, cũng sẽ đụng phải không ít kẻ vô duyên vô cớ thù ghét bạn. Vậy nên, chẳng cần phải để điều đó ảnh hưởng đến tâm trạng của mình. Trên đường về nhà, sẽ luôn gặp phải vài con chó điên bên đường sủa loạn, bạn chỉ cần tiếp tục tiến bước, chẳng cần bận tâm. Cuộc sống này chính là như vậy, một mặt hứng chịu đau thương, một mặt học cách kiên cường.”"));
        mData.add(new OPhoto("http://67.media.tumblr.com/b4034a9c244e55a7644246e2bcf2568f/tumblr_nta4dkyXuY1sxnbwko1_1280.png","“12 khoảnh khắc trong đời khiến bạn cảm thấy cô đơn “cùng cực”\n" +
                "Người ta sợ cô đơn, thường cố lẩn vào đám đông để tìm chút “hơi người”, để không thấy mình lẻ bóng. Nhưng nhiều khi lạc giữa dòng người xô bồ ấy, ta lại thấm thía nỗi cô đơn cùng cực hơn bao giờ hết!\n" +
                "1. Ba đứa chúng tôi chơi thân với nhau, thỉnh thoảng không hiểu sao tôi không thể bắt kịp câu chuyện của 2 đứa nó. Cảm giác lúc đó như bị gạt ra rìa, lạc lõng kinh khủng.\n" +
                "2. Có người yêu mà cũng như không, một mình đi dạo phố, một mình đi mua sắm, tự đi ăn rồi tự bê đồ đạc, khóc thì tự lau nước mắt, cứ ngớ ngẩn đợi chờ sự quan tâm từ người ấy.\n" +
                "3. Đó là khi gửi tin nhắn qua Facebook cho cậu ấy nhưng chờ mãi không thấy phản hồi, tự an ủi mình là cậu ấy chắc chưa lên mạng nhưng một lúc sau thì thấy cậu ấy cập nhật status.\n" +
                "4. Cảm giác cô đơn chính là sau cả ngày trời lang thang bên ngoài, trở về phòng chỉ thấy trống rỗng, cả phòng lặng ngắt không một bóng người.\n" +
                "5. Đó là khi trong lòng buồn bực, chán nản muốn kể lể với một ai đó nhưng lướt đi lướt lại danh bạ điện thoại cũng chẳng tìm nổi một người để trút bầu tâm sự.\n" +
                "6. Đơn giản chỉ là mình lạc vào giữa một biển người nhộn nhịp, nói nói cười cười vui vẻ, muốn bắt chuyện với ai đó nhưng không biết làm thế nào và bắt đầu từ đâu.\n" +
                "7. Điện thoại để không mấy hôm, lúc mở ra cũng chẳng có nổi một tin nhắn, một cuộc gọi nhỡ từ bạn bè, ngoài mấy cái tin khuyến mãi, dịch vụ tổng đài…\n" +
                "8. Thằng bạn thân có người yêu, thế là không còn những buổi đi lượn lờ “mài đường” cùng nó, ít dần những lần lang thang quán xá cùng nhau và cảm giác như nó “lờ” mình, chỉ quan tâm đến cô bạn gái thôi.\n" +
                "9. Có lần đi chơi với nhóm bạn, tôi bị tuột dây giày, vừa cúi xuống buộc lại thì lúc ngẩng lên đã thấy đám bạn đi xa, vừa đi vừa cười nói vui vẻ, hình như chẳng ai quan tâm đợi mình.\n" +
                "10. Cảm giác ấm ức tột cùng khi bị hiểu lầm mà không thể giải thích, cảm thấy như không ai hiểu và lắng nghe mình.\n" +
                "11. Sinh nhật năm trước, tôi để ngày sinh trên Facebook của mình ở chế độ công khai. Bạn bè thi nhau nhắn tin chúc mừng này nọ. Năm nay tôi để ẩn ngày sinh thì quả nhiên chẳng thấy ai đả động đến, không có nấy một tin nhắn chúc sinh nhật.\n" +
                "12. Có lần buồn quá tôi lén vào nhà WC khóc một mình, sợ lũ bạn phải bận tâm, buồn vì mình nên tôi phải lau nước mắt thật kỹ để không ai phát hiện ra. Bước ra ngoài, thấy chúng nó cười nói rôm rả, chẳng ai để tâm đến mình. Có vẻ tôi lo xa quá rồi!”"));

    }

    @Override
    public void onClick(View v) {
        if (v.equals(mButtonLeft)) {
            mSwipeStack.swipeTopViewToLeft();
        } else if (v.equals(mButtonRight)) {
            mSwipeStack.swipeTopViewToRight();
        } else if (v.equals(mFab)) {
          /*  mData.add(getString(R.string.dummy_fab));
            mAdapter.notifyDataSetChanged();*/
        }
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
        /*    case R.id.menuReset:
                mSwipeStack.resetStack();
                Snackbar.make(mFab, R.string.stack_reset, Snackbar.LENGTH_SHORT).show();
                return true;
            case R.id.menuGitHub:
                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW, Uri.parse("https://github.com/flschweiger/SwipeStack"));
                startActivity(browserIntent);
                return true;*/
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onViewSwipedToRight(int position) {
        /*String swipedElement = mAdapter.getItem(position);
        Toast.makeText(this, getString(R.string.view_swiped_right, swipedElement),
                Toast.LENGTH_SHORT).show();*/
    }

    @Override
    public void onViewSwipedToLeft(int position) {
       /* String swipedElement = mAdapter.getItem(position);
        Toast.makeText(this, getString(R.string.view_swiped_left, swipedElement),
                Toast.LENGTH_SHORT).show();*/
    }

    @Override
    public void onStackEmpty() {
        Toast.makeText(this, R.string.stack_empty, Toast.LENGTH_SHORT).show();
    }

    public class SwipeStackAdapter extends BaseAdapter {

        private List<OPhoto> mData;

        public SwipeStackAdapter(List<OPhoto> data) {
            this.mData = data;
        }

        @Override
        public int getCount() {
            return mData.size();
        }

        @Override
        public OPhoto getItem(int position) {
            return mData.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }


        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.card, parent, false);
            }
            ImageView imageView= (ImageView) convertView.findViewById(R.id.item);
            final TextView textViewCard = (TextView) convertView.findViewById(R.id.txt);
            textViewCard.setText(mData.get(position).getName());
            Glide.with(MainActivity.this).load(mData.get(position).getImage())
                    .thumbnail(0.5f)
                    .crossFade()
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(imageView);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(MainActivity.this, DetailActivity.class);
                    intent.putExtra("txt",textViewCard.getText().toString());
                    intent.putExtra("url",mData.get(position).getImage());
                    startActivity(intent);

                }
            });

            return convertView;
        }
    }
}
