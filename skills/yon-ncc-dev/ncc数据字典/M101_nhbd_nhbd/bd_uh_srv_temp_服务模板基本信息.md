# |<<

**服务模板基本信息 (bd_uh_srv_temp / com.yonyou.yh.nhis.bd.pub2.tmpl.vo.SrvTmplVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1127.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srvtemp | 模板主键 | pk_srvtemp | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | code | 模板编码 | code | varchar(50) |  | 字符串 (String) |
| 5 | name | 模板名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | pk_father | 上级模板主键 | pk_father | varchar(20) |  | 字符串 (String) |
| 7 | eu_right | 模板使用范围主键 | eu_right | varchar(20) |  | 模板使用范围(自定义档案) (Defdoc-030002) |
| 8 | pk_dept | 使用科室 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 9 | pk_psn | 使用人员 | pk_psn | varchar(20) |  | 人员基本信息 (psndoc) |
| 10 | pk_diag | 适用疾病 | pk_diag | varchar(20) |  | 标准诊断编码 (stddiag) |
| 11 | dt_right | 模板适用范围编码 | dt_right | varchar(50) |  | 字符串 (String) |
| 12 | dt_srvtype | 服务类型编码 | dt_srvtype | varchar(50) |  | 字符串 (String) |
| 13 | mnecode | 助记码 | mnecode | varchar(150) |  | 字符串 (String) |
| 14 | pk_right | 模板使用范围主键新增 | pk_right | varchar(20) |  | 模板使用范围(自定义档案) (Defdoc-030002) |
| 15 | pk_srvtemp_father | 上级模板主键新增 | pk_srvtemp_father | char(20) |  | 字符串 (String) |
| 16 | pk_srvtype | 服务类型主键 | pk_srvtype | varchar(20) |  | 服务类型(自定义档案) (Defdoc-030000) |
| 17 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 18 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 19 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 20 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |