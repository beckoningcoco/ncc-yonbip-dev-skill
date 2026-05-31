# |<<

**排班预约_预约_门诊 (uh_pv_opappt / com.yonyou.yh.nhis.sch.appt.vo.PvOpApptVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6243.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pvopappt | 就诊预约主键 | pk_pvopappt | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_schappt | 预约 | pk_schappt | varchar(20) |  | 预约 (SchApptVO) |
| 5 | code_phy_res | 对应医生 | code_phy_res | varchar(30) |  | 字符串 (String) |
| 6 | code_dept_res | 对应科室 | code_dept_res | varchar(30) |  | 字符串 (String) |
| 7 | code_dept_belong | 资源归属部门 | code_dept_belong | char(20) |  | 主键 (UFID) |
| 8 | code_srv | 对应服务类型 | code_srv | varchar(30) |  | 字符串 (String) |
| 9 | eu_apptmode | 预约方式 | eu_apptmode | int |  | 预约方式 (ApptWayEnum) |  | 0=正常预约; |