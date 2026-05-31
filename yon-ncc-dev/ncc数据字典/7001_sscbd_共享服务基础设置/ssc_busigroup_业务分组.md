# |<<

**业务分组 (ssc_busigroup / nc.vo.ssc.task.allotrule.SSCBusiGroupVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5509.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_busigroup | 主键 | pk_busigroup | char(20) | √ | 主键 (UFID) |
| 2 | pk_father | 上级成员 | pk_father | varchar(50) |  | 字符串 (String) |
| 3 | innercode | 内部编码 | innercode | varchar(50) |  | 字符串 (String) |
| 4 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 5 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | memo | 业务分组描述 | memo | varchar(50) |  | 字符串 (String) |
| 7 | pk_sscorg | 所属共享服务中心 | pk_sscorg | varchar(50) |  | 字符串 (String) |
| 8 | def1 | 自定义项1 | def1 | varchar(50) |  | 字符串 (String) |
| 9 | def2 | 自定义项2 | def2 | varchar(50) |  | 字符串 (String) |
| 10 | def3 | 自定义项3 | def3 | varchar(50) |  | 字符串 (String) |
| 11 | def4 | 自定义项4 | def4 | varchar(50) |  | 字符串 (String) |
| 12 | def5 | 自定义项5 | def5 | varchar(50) |  | 字符串 (String) |
| 13 | def6 | 自定义项6 | def6 | varchar(50) |  | 字符串 (String) |
| 14 | def7 | 自定义项7 | def7 | varchar(50) |  | 字符串 (String) |
| 15 | def8 | 自定义项8 | def8 | varchar(50) |  | 字符串 (String) |
| 16 | def9 | 自定义项9 | def9 | varchar(50) |  | 字符串 (String) |
| 17 | def10 | 自定义项10 | def10 | varchar(50) |  | 字符串 (String) |
| 18 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 19 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 20 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 21 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |