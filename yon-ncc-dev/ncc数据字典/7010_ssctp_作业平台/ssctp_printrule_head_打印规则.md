# |<<

**打印规则 (ssctp_printrule_head / nc.vo.ssctp.printrule.PrintRuleHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5658.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_printrule_head | 主键 | pk_printrule_head | char(20) | √ | 主键 (UFID) |
| 2 | pk_sscunit | 共享服务中心 | pk_sscunit | varchar(50) |  | 字符串 (String) |
| 3 | pk_booktype | 账簿类型 | pk_booktype | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_comvctemplate | 普通凭证归档模板 | pk_comvctemplate | varchar(50) |  | 字符串 (String) |
| 6 | pk_numvctemplate | 数量凭证归档模板 | pk_numvctemplate | varchar(50) |  | 字符串 (String) |
| 7 | pk_curvctemplate | 外币凭证归档模板 | pk_curvctemplate | varchar(50) |  | 字符串 (String) |
| 8 | pk_curnumvctemplate | 外币数量凭证模板 | pk_curnumvctemplate | varchar(50) |  | 字符串 (String) |
| 9 | modifytime | 最后修改时间 | modifytime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 11 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 12 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |