# |<<

**数据元分类 (bd_uh_ph_dmcate / com.yonyou.yh.nhis.bd.phdm.vo.PhDmCateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1082.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_phdmcate | 数据元分类主键 | pk_phdmcate | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | code | 数据元分类编码 | code | varchar(30) |  | 字符串 (String) |
| 5 | name | 数据元分类名称 | name | varchar(50) |  | 多语文本 (MultiLangText) |
| 6 | pk_father | 上级码 | pk_father | varchar(20) |  | 数据元分类 (phdmcate) |
| 7 | innercode | 内部码 | innercode | varchar(30) |  | 字符串 (String) |
| 8 | mnecode | 助记符 | mnecode | varchar(30) |  | 字符串 (String) |
| 9 | pk_org_v | 组织多版本 | pk_org_v | varchar(20) |  | 组织_业务单元_人力资源组织版本信息 (hrorg_v) |
| 10 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 11 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 12 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 13 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |