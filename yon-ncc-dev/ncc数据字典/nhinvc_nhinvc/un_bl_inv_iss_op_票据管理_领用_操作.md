# |<<

**票据管理_领用_操作 (un_bl_inv_iss_op / com.yonyou.yh.nhis.bl.invc.vo.InvcIssOpVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6295.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invissop | 票据领用操作 | pk_invissop | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | billtype | 单据类型 | billtype | varchar(30) |  | 字符串 (String) |
| 5 | code_op | 操作业务编码 | code_op | varchar(30) |  | 字符串 (String) |
| 6 | name_op | 操作业务名称 | name_op | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | desc_op | 操作描述 | desc_op | varchar(256) |  | 字符串 (String) |
| 8 | pk_dept_op | 录入部门 | pk_dept_op | varchar(20) |  | 组织_部门 (dept) |
| 9 | pk_psn_op | 录入人员 | pk_psn_op | varchar(20) |  | 人员基本信息 (psndoc) |
| 10 | date_op | 录入日期 | date_op | char(19) |  | 日期 (UFDate) |
| 11 | note | 备注 | note | varchar(256) |  | 字符串 (String) |
| 12 | pk_org_v | 所属组织版本信息 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 13 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 14 | creationtime | 创建时间 | creationtime | char(19) |  | 日期 (UFDate) |
| 15 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 16 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期 (UFDate) |