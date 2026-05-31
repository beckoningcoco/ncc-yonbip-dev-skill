# |<<

**消息源接收人配置 (pub_msgres_rcvconf / nc.buzimsg.vo.MsgresRcvConfVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4741.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_msgres_rcvconf | 主键 | pk_msgres_rcvconf | char(20) | √ | 主键 (UFID) |
| 2 | msgres_code | 所属消息源编码 | msgres_code | varchar(50) | √ | 字符串 (String) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_billtypeid | 交易类型 | pk_billtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 5 | receivingrule | 接收规则真正存储串 | receivingrule | image |  | BLOB (BLOB) |
| 6 | pk_billtypecode | 交易类型编码 | pk_billtypecode | varchar(50) |  | 字符串 (String) |
| 7 | receivingrule_disp | 接收规则 | receivingrule_disp | image |  | BLOB (BLOB) |
| 8 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 9 | prilevel | 优先级 | prilevel | int |  | 整数 (Integer) |
| 10 | receivrulejson | 构建json | receivrulejson | image |  | BLOB (BLOB) |
| 11 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 12 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 13 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 14 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |