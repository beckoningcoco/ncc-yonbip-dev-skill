# |<<

**临床主诉术语定义_症状 (bd_term_prob_sym / com.yonyou.yh.nhis.bd.complaint.vo.ComplaintSymVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1008.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sym | 症状主键 | pk_sym | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_syscate | 术语分类 | pk_syscate | varchar(20) | √ | 临床主诉术语定义_症状分类 (complaint_symcate) |
| 5 | code | 术语编码 | code | varchar(50) | √ | 字符串 (String) |
| 6 | name | 术语名称 | name | varchar(50) | √ | 字符串 (String) |
| 7 | symdesc | 术语描述 | symdesc | varchar(256) |  | 备注 (Memo) |
| 8 | pk_org_v | 组织多版本 | pk_org_v | varchar(20) |  | 组织_业务单元_人力资源组织版本信息 (hrorg_v) |
| 9 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 10 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 12 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |