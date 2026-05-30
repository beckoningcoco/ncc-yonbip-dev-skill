# |<<

**医疗执行_医嘱_物品_使用(服用) (uh_ex_ord_pd_admin / com.yonyou.yh.nhis.ex.pd.vo.OrdPdAdminVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6100.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_expdadmin | 医技物品使用主键 | pk_expdadmin | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_pati | 患者 | pk_pati | varchar(20) |  | 患者基本信息 (pati) |
| 5 | pk_pvtype | 就诊类型 | pk_pvtype | varchar(20) |  | 就诊类型 (pvtype) |
| 6 | code_pvtype | 就诊类型编码 | code_pvtype | varchar(50) |  | 字符串 (String) |
| 7 | pk_pv | 就诊 | pk_pv | varchar(20) |  | 患者就诊 (PatiVisitVO) |
| 8 | pk_ord | 医嘱 | pk_ord | varchar(50) |  | 字符串 (String) |
| 9 | name_ord | 医嘱名称 | name_ord | varchar(256) |  | 字符串 (String) |
| 10 | desc_ord | 医嘱内容 | desc_ord | varchar(256) |  | 字符串 (String) |
| 11 | date_freqex | 执行时刻描述 | date_freqex | varchar(256) |  | 字符串 (String) |
| 12 | date_ex_plan | 计划执行日期 | date_ex_plan | char(19) |  | 日期时间 (UFDateTime) |
| 13 | pk_org_ex_plan | 计划执行机构 | pk_org_ex_plan | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 14 | pk_dept_ex_plan | 计划执行部门 | pk_dept_ex_plan | varchar(20) |  | 组织_部门 (dept) |
| 15 | date_ex_real | 实际执行日期 | date_ex_real | char(19) |  | 日期时间 (UFDateTime) |
| 16 | pk_org_ex_real | 实际执行机构 | pk_org_ex_real | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 17 | pk_dept_ex_real | 实际执行部门 | pk_dept_ex_real | varchar(20) |  | 组织_部门 (dept) |
| 18 | pk_psn_ex_real | 实际执行人员 | pk_psn_ex_real | varchar(20) |  | 人员基本信息 (psndoc) |
| 19 | name_psn_ex_real | 实际执行人员名称 | name_psn_ex_real | varchar(50) |  | 字符串 (String) |
| 20 | pk_pdadmin | 执行结果描述 | pk_pdadmin | varchar(50) |  | 字符串 (String) |
| 21 | dt_pdadmin | 执行结果描述编码 | dt_pdadmin | varchar(50) |  | 字符串 (String) |
| 22 | pk_org_v | 所属组织版本信息 | pk_org_v | varchar(20) |  | 组织_业务单元_医卫版本 (hisorg_v) |
| 23 | note | 备注 | note | varchar(256) |  | 字符串 (String) |
| 24 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 25 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 26 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 27 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |