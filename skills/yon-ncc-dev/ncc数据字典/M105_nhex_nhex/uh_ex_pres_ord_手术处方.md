# |<<

**手术处方 (uh_ex_pres_ord / com.yonyou.yh.nhis.ex.op.vo.ExOpPresOrdVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6110.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pres | 处方主键 | pk_pres | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_pvtype | 就诊类型 | pk_pvtype | varchar(20) |  | 就诊类型 (pvtype) |
| 5 | code_pvtype | 就诊类型编码 | code_pvtype | varchar(30) |  | 字符串 (String) |
| 6 | pk_pati | 患者 | pk_pati | varchar(20) |  | 患者基本信息 (pati) |
| 7 | pk_pv | 就诊 | pk_pv | varchar(20) |  | 患者就诊 (PatiVisitVO) |
| 8 | pk_prestype | 处方类型 | pk_prestype | varchar(20) |  | 处方类型(自定义档案) (Defdoc-060101) |
| 9 | dt_prestype | 处方类型编码 | dt_prestype | varchar(50) |  | 字符串 (String) |
| 10 | code_pres | 处方编码 | code_pres | varchar(30) |  | 字符串 (String) |
| 11 | date_pres | 处方日期 | date_pres | char(19) |  | 日期时间 (UFDateTime) |
| 12 | pk_dept_phy | 开立科室 | pk_dept_phy | varchar(20) |  | 组织_部门 (dept) |
| 13 | pk_psn_phy | 开立医生 | pk_psn_phy | varchar(20) |  | 人员基本信息 (psndoc) |
| 14 | name_psn_phy | 开立医生名称 | name_psn_phy | varchar(50) |  | 字符串 (String) |
| 15 | note | 备注 | note | varchar(256) |  | 字符串 (String) |
| 16 | name_agent | 代办人姓名 | name_agent | varchar(50) |  | 字符串 (String) |
| 17 | idno_agent | 代办人身份证号 | idno_agent | varchar(30) |  | 字符串 (String) |
| 18 | addr_agent | 代办人联系地址 | addr_agent | varchar(256) |  | 字符串 (String) |
| 19 | teleno_agent | 代办人电话 | teleno_agent | varchar(30) |  | 字符串 (String) |
| 20 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 21 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 22 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 23 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |