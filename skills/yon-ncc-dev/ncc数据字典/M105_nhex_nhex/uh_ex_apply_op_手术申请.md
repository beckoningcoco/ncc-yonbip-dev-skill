# |<<

**手术申请 (uh_ex_apply_op / com.yonyou.yh.nhis.ex.op.vo.ExOpApplyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6061.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_applyop | 手术申请 | pk_applyop | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_pati | 患者 | pk_pati | varchar(20) |  | 患者基本信息 (pati) |
| 5 | pk_pv | 患者就诊 | pk_pv | varchar(20) |  | 患者就诊 (PatiVisitVO) |
| 6 | code_apply | 申请单号 | code_apply | varchar(30) |  | 字符串 (String) |
| 7 | pk_org_apply | 申请机构 | pk_org_apply | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 8 | pk_dept_apply | 申请科室 | pk_dept_apply | varchar(20) |  | 组织_部门 (dept) |
| 9 | pk_psn_apply | 申请医生 | pk_psn_apply | varchar(20) |  | 人员基本信息 (psndoc) |
| 10 | name_psn_apply | 申请医生姓名 | name_psn_apply | varchar(50) |  | 字符串 (String) |
| 11 | date_apply | 申请日期 | date_apply | char(19) |  | 日期时间 (UFDateTime) |
| 12 | pk_diag_bop | 术前诊断 | pk_diag_bop | varchar(20) |  | 临床_诊断 (cndiag) |
| 13 | desc_diag_bop | 术前诊断描述串 | desc_diag_bop | varchar(256) |  | 字符串 (String) |
| 14 | pk_psn_phy_op | 手术主刀医生 | pk_psn_phy_op | varchar(20) |  | 人员基本信息 (psndoc) |
| 15 | pk_oplevel | 手术级别 | pk_oplevel | varchar(20) |  | 手术等级(自定义档案) (Defdoc-030305) |
| 16 | dt_oplevel | 手术级别编码 | dt_oplevel | varchar(50) |  | 字符串 (String) |
| 17 | pk_srv_op | 拟行手术编码 | pk_srv_op | varchar(50) |  | 字符串 (String) |
| 18 | desc_op | 拟行手术描述 | desc_op | varchar(256) |  | 字符串 (String) |
| 19 | pk_anae | 拟行麻醉方法 | pk_anae | varchar(20) |  | 麻醉方法(自定义档案) (Defdoc-030300) |
| 20 | dt_anae | 拟行麻醉方法编码 | dt_anae | varchar(50) |  | 字符串 (String) |
| 21 | pk_asepsis | 无菌程度 | pk_asepsis | varchar(20) |  | 无菌程度(自定义档案) (Defdoc-030307) |
| 22 | dt_asepsis | 无菌程度编码 | dt_asepsis | varchar(50) |  | 字符串 (String) |
| 23 | pk_bodypart_op | 手术目标部位 | pk_bodypart_op | varchar(20) |  | 手术部位(自定义档案) (Defdoc-030302) |
| 24 | dt_bodypart_op | 手术目标部位编码 | dt_bodypart_op | varchar(50) |  | 字符串 (String) |
| 25 | date_op_begin | 计划手术开始日期 | date_op_begin | char(19) |  | 日期时间 (UFDateTime) |
| 26 | date_op_end | 计划手术结束日期 | date_op_end | char(19) |  | 日期时间 (UFDateTime) |
| 27 | pk_opt | 手术台编码 | pk_opt | varchar(20) |  | 手术台 (opttbl) |
| 28 | pk_psn_anae | 手术麻醉医生 | pk_psn_anae | varchar(20) |  | 人员基本信息 (psndoc) |
| 29 | name_psn_anae | 手术麻醉医生名 | name_psn_anae | varchar(50) |  | 字符串 (String) |
| 30 | pk_psn_asis | 手术一助 | pk_psn_asis | varchar(20) |  | 人员基本信息 (psndoc) |
| 31 | name_psn_asis | 手术一助名称 | name_psn_asis | varchar(50) |  | 字符串 (String) |
| 32 | pk_psn_asis2 | 手术二助 | pk_psn_asis2 | varchar(20) |  | 人员基本信息 (psndoc) |
| 33 | name_psn_asis2 | 手术二助名称 | name_psn_asis2 | varchar(50) |  | 字符串 (String) |
| 34 | date_comfirm | 排班后确认日期 | date_comfirm | char(19) |  | 日期时间 (UFDateTime) |
| 35 | ticketno | 手术台次 | ticketno | int |  | 整数 (Integer) |
| 36 | date_est_begin | 预计手术开始时 | date_est_begin | char(19) |  | 日期时间 (UFDateTime) |
| 37 | eu_status | 手术过程状态 | eu_status | int |  | 整数 (Integer) |
| 38 | flag_urgent | 加急标志 | flag_urgent | char(1) |  | 布尔类型 (UFBoolean) |
| 39 | note | 备注 | note | varchar(4000) |  | 字符串 (String) |
| 40 | pk_dept_entry | 录入科室 | pk_dept_entry | varchar(20) |  | 字符串 (String) |
| 41 | pk_psn_entry | 录入人 | pk_psn_entry | varchar(20) |  | 人员基本信息 (psndoc) |
| 42 | name_psn_entry | 录入人姓名 | name_psn_entry | varchar(50) |  | 字符串 (String) |
| 43 | date_entry | 录入日期 | date_entry | char(19) |  | 日期时间 (UFDateTime) |
| 44 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 45 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 46 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 47 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |