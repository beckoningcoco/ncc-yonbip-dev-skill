# |<<

**短信信息 (uh_bd_shortMsg / com.yonyou.yh.nhis.bd.tpi.sms.vo.ShortMsgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5917.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_shortmsg | 短信主键 | pk_shortmsg | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | mobileno | 手机号 | mobileno | varchar(11) |  | 字符串 (String) |
| 5 | smsinfo | 发送内容 | smsinfo | varchar(50) |  | 字符串 (String) |
| 6 | sendmethod | 发送方式 | sendmethod | int |  | 发送方式 (sendmethod) |  | 1=立即; |