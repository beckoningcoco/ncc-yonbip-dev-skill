# |<<

**自定义接收人 (pub_msgres_sfdfrcv / nc.buzimsg.vo.SelfDefReceiverVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4743.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_selfdef_rcv | 主键 | pk_selfdef_rcv | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) | √ | 字符串 (String) |
| 3 | name | 名称 | name | varchar(50) |  | 字符串 (String) |
| 4 | msgres_code | 所属消息源编码 | msgres_code | varchar(50) | √ | 字符串 (String) |
| 5 | foldername | 多语资源文件夹名 | foldername | varchar(50) |  | 字符串 (String) |
| 6 | resid | 多语资源号 | resid | varchar(50) |  | 字符串 (String) |
| 7 | cnvtorimplfullpath | 自定义接收人实现类全路径 | cnvtorimplfullpath | varchar(250) | √ | 字符串 (String) |
| 8 | creator | 创建人 | creator | varchar(20) |  | 字符串 (String) |
| 9 | creationtime | 创建时间 | creationtime | char(19) |  | 字符串 (String) |
| 10 | modifier | 最后修改人 | modifier | varchar(20) |  | 字符串 (String) |
| 11 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 字符串 (String) |