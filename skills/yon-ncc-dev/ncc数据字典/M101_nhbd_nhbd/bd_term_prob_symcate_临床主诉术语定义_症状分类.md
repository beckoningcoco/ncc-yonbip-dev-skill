# |<<

**临床主诉术语定义_症状分类 (bd_term_prob_symcate / com.yonyou.yh.nhis.bd.complaint.vo.ComplaintCateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1009.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_symcate | 症状主键 | pk_symcate | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | code | 术语分类编码 | code | varchar(50) | √ | 字符串 (String) |
| 5 | name | 术语分类名称 | name | varchar(50) | √ | 字符串 (String) |
| 6 | symcatedesc | 术语分类描述 | symcatedesc | varchar(50) |  | 字符串 (String) |
| 7 | pk_father | 上级分类 | pk_father | varchar(20) |  | 临床主诉术语定义_症状分类 (complaint_symcate) |
| 8 | innercode | 内部码 | innercode | varchar(50) |  | 字符串 (String) |
| 9 | mnecode | 助记符 | mnecode | varchar(50) |  | 字符串 (String) |
| 10 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 11 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 12 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 13 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |