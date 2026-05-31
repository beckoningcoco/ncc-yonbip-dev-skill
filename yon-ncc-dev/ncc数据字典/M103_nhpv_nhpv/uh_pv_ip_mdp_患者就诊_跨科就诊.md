# |<<

**患者就诊_跨科就诊 (uh_pv_ip_mdp / com.yonyou.yh.nhis.pv.pvipmdp.vo.PvIpMdpVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6236.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pvmdp | 跨科就诊主键 | pk_pvmdp | char(20) | √ | 主键 (UFID) |
| 2 | pk_pv | 就诊主键 | pk_pv | varchar(20) |  | 患者就诊 (pvbanner) |
| 3 | pk_dept | 患者当前科室 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 4 | pk_dept_ns | 患者当前病区 | pk_dept_ns | varchar(20) |  | 组织_部门 (dept) |
| 5 | date_begin | 当前时间 | date_begin | char(19) |  | 日期时间 (UFDateTime) |
| 6 | pk_psn_begin | 当前操作员 | pk_psn_begin | varchar(20) |  | 人员基本信息 (psndoc) |
| 7 | name_psn_begin | 当前操作员姓名 | name_psn_begin | varchar(50) |  | 字符串 (String) |
| 8 | pk_dept_mdp | 跨科就诊科室 | pk_dept_mdp | varchar(20) |  | 组织_部门 (dept) |
| 9 | pk_dept_mns | 跨科就诊病区 | pk_dept_mns | varchar(20) |  | 组织_部门 (dept) |
| 10 | date_end | 作废时间 | date_end | char(19) |  | 日期(开始) (UFDateBegin) |
| 11 | pk_psn_end | 作废人 | pk_psn_end | varchar(20) |  | 人员基本信息 (psndoc) |
| 12 | name_psn_end | 作废人姓名 | name_psn_end | varchar(50) |  | 字符串 (String) |
| 13 | flag_fin | 完成标志 | flag_fin | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | flag_canc | 作废标志 | flag_canc | char(1) |  | 布尔类型 (UFBoolean) |