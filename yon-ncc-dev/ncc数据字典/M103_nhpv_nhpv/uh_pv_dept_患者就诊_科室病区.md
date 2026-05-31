# |<<

**患者就诊_科室病区 (uh_pv_dept / com.yonyou.yh.nhis.pv.pvipregister.vo.PatiVisitIpDeptVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6218.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pvdept | 患者就诊科室主键 | pk_pvdept | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_pv | 就诊主键 | pk_pv | char(50) |  | 字符串 (String) |
| 5 | pk_dept | 科室 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 6 | pk_dept_ns | 病区 | pk_dept_ns | varchar(50) |  | 字符串 (String) |
| 7 | date_begin | 时间日期_开始 | date_begin | char(19) |  | 日期时间 (UFDateTime) |
| 8 | date_end | 时间日期_结束 | date_end | char(19) |  | 日期时间 (UFDateTime) |
| 9 | pk_psn_begin | 操作人员_开始 | pk_psn_begin | varchar(20) |  | 人员基本信息 (psndoc) |
| 10 | name_psn_begin | 操作人员_开始名称 | name_psn_begin | varchar(50) |  | 字符串 (String) |
| 11 | pk_psn_end | 操作人员_结束 | pk_psn_end | varchar(20) |  | 人员基本信息 (psndoc) |
| 12 | name_psn_end | 操作人员_结束名称 | name_psn_end | varchar(50) |  | 字符串 (String) |
| 13 | flag_admit | 入院科室标志 | flag_admit | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | flag_discharge | 出院科室标志 | flag_discharge | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | dt_patieva | 患者评价编码 | dt_patieva | varchar(50) |  | 字符串 (String) |
| 16 | desc_patieva | 患者评价描述 | desc_patieva | varchar(256) |  | 字符串 (String) |
| 17 | pk_pvdept_link | 对应就诊科室 | pk_pvdept_link | varchar(20) |  | 组织_部门 (dept) |
| 18 | eu_status | 状态 | eu_status | int |  | 登记状态 (StatusEnum) |  | 0=申请; |