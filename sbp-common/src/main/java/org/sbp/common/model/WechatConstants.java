package org.sbp.common.model;


public class WechatConstants {
 // 微信推送模板secret
    public static final String TEMPLATE_MESSAGE_SECRET = "";

    // 微信推送url
    public static final String WECHAT_TEMPLATE_MESSAGE_URL = "http://www.eauto100.com/wxservice/api/v1/messages";

    /**
     * 订单发货提醒
     * 商品明细 下单时间 配送地址 配送人 联系电话
     * 
     * @author zwq
     */
    public static final String WECHAT_ORDER_SEND_REMIND = "N99awq7GtIlzdG0uXtOMzXCZu1BgPslosP7rHk0CwVg";

    /**
     * 询价单状态通知
     * 状态 单号 时间
     * 
     * @author zwq
     */
    public static final String WECHAT_ASK_STATE_REMIND = "N99awq7GtIlzdG0uXtOMzXCZu1BgPslosP7rHk0CwVg";

    /**
     * 需求单提交成功通知
     * 需求单编号 下单时间
     * 
     * @author zwq
     */
    public static final String WECHAT_ASK_SUB_SUCCESS_REMIND = "4-zDDXbwfNOgN_X3dUrlr62iwRc0wliEOxmfhHU3BYs";

    /**
     * 订单生产成功
     * 订单编号 生产时间 订单金额 订单商品
     * 
     * @author zwq
     */
    public static final String WECHAT_ORDER_SUCCESS_REMIND = "tnSJtfFlpIRIaDaOyT6SxoGg_PGLEB8qtrRBNlqIypw";

    /**
     * 任务处理通知
     * 任务名称 通知类型
     * 
     * @author zwq
     */
    public static final String WECHAT_TASK_DEAL_REMIND = "iowLVDm2V_bcbK5F43iN9BYJVP6ryp7-1NgubZOn_I0";

    /**
     * 消息发送状态提醒
     * 消息类型 发送状态 发送时间 发送对象
     * 
     * @author zwq
     */
    public static final String WECHAT_MSG_SEND_STATE_REMIND = "zRNBUEYzw_eTRRa8RIlY_XeAKL1ACMgdudhPWusL4tI";

    /**
     * 新工单提醒
     * 工单名称 生成时间 用户名称
     * 
     * @author zwq
     */
    public static final String WECHAT_NEW_WORK_ORDER_REMIND = "BTLVTDuWTul6L922g1iPv-F-wg3xkzs17gxMqnHOpyQ";

    /**
     * 新订单处理通知
     * 订单编号 订单商家 订单时间
     * 
     * @author zwq
     */
    public static final String WECHAT_NEW_ORDER_DEAL_REMIND = "65JOpWsgptarlK9BDJLre2uEnLWrl_AuKkGZTVebkfc";

    /**
     * 用户下单通知
     * 下单账号 下单时间 下单产品 下单金额 联系金额
     * 
     * @author zwq
     */
    public static final String WECHAT_SUB_ORDER_REMIND = "65JOpWsgptarlK9BDJLre2uEnLWrl_AuKkGZTVebkfc";

    /**
     * 彩票投注成功通知
     * 彩票期号 投注时间 开奖时间
     * 
     * @author zwq
     */
    public static final String WECHAT_SUB_LOTTER_REMIND = "fZyDThIjAbAfJO7vt6mjB5dco_J6FUav4xK0u6ltxps";

    /**
     * 赠送单提醒
     * 订单编号 下单时间 赠送状态 接收人
     * 
     * @author zwq
     */
    public static final String WECHAT_GIFT_ORDER_REMIND = "TGyR-bJZiK6yk0fGzWerVqXRpRklQxFq7qwTPGp3qfw";
    
    /**
     * 未中标提醒
     * 订单编号 下单时间 赠送状态 接收人
     * 
     * @author zwq
     */
    public static final String WECHAT_NOT_BID_REMIND = "KGLlQSyR8icSthaZu4RRVNPgofHMlihmuD42A-bJbyA";
}
