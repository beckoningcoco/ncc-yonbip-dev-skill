# |<<

**知识库 (bd_know_base / com.yonyou.yh.nhis.bd.ecd.vo.BdKnowBaseVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/872.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_knowbase | 知识库主键 | pk_knowbase | char(20) | √ | 主键 (UFID) |
| 2 | code | 知识库编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 知识库名称 | name | varchar(50) |  | 字符串 (String) |
| 4 | inner_ver | 知识库内部版本 | inner_ver | int |  | 整数 (Integer) |
| 5 | ver | 知识库版本 | ver | varchar(50) |  | 字符串 (String) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 8 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |