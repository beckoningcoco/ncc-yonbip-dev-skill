# |<<

**接收人存储表 (pub_msgres_rcv / nc.buzimsg.vo.MsgresRcvVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4740.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_msgres_receiver | 主键 | pk_msgres_receiver | char(20) | √ | 主键 (UFID) |
| 2 | receivertype | 接收人类型 | receivertype | int |  | 整数 (Integer) |
| 3 | receiverpk | 接收人主键 | receiverpk | varchar(50) |  | 字符串 (String) |
| 4 | pk_msgres_rcvconf | 消息源接收人配置主键 | pk_msgres_rcvconf | varchar(50) |  | 字符串 (String) |