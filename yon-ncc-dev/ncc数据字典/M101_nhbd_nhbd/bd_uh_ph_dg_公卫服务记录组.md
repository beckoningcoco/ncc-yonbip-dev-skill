# |<<

**公卫服务记录组 (bd_uh_ph_dg / com.yonyou.yh.nhis.bd.phds.vo.PhDsDgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1080.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_phdg | 数据组主键 | pk_phdg | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_phds | 数据集 | pk_phds | varchar(20) |  | 公卫服务数据集 (phds) |
| 5 | sortno | 组排序号 | sortno | int |  | 整数 (Integer) |
| 6 | code | 记录组编码 | code | varchar(30) |  | 字符串 (String) |
| 7 | name | 记录组名称 | name | varchar(50) |  | 多语文本 (MultiLangText) |
| 8 | dt_phdgtype | 记录组类型 | dt_phdgtype | varchar(20) |  | 记录组类型(自定义档案) (Defdoc-070004) |
| 9 | no_page | 页签号 | no_page | int |  | 整数 (Integer) |
| 10 | name_page | 页签名称 | name_page | varchar(50) |  | 字符串 (String) |
| 11 | note | 备注 | note | varchar(256) |  | 字符串 (String) |
| 12 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 13 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 14 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 15 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |