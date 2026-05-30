# |<<

**消息源消息模板配置 (pub_msgres_tmpconf / nc.buzimsg.vo.MsgresTempConfVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4744.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_msgres_tempconf | 主键 | pk_msgres_tempconf | char(20) | √ | 主键 (UFID) |
| 2 | msgres_code | 所属消息源编码 | msgres_code | varchar(50) | √ | 字符串 (String) |
| 3 | pk_billtypeid | 交易类型 | pk_billtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 4 | msgsendtype | 消息发送方式 | msgsendtype | varchar(50) |  | 消息发送类型 (msgsendtypeenum) |  | 0=NC; |