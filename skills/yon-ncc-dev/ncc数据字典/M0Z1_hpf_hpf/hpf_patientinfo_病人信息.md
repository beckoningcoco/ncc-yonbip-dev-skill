# |<<

**病人信息 (hpf_patientinfo / nc.vo.hpf.patient.PatientInfoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2641.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_patient | 主键 | pk_patient | char(20) | √ | 主键 (UFID) |
| 2 | syscode | 业务单元编码 | syscode | varchar(20) |  | 数据来源系统设置 (EntryconfigVO) |
| 3 | vcardid | 身份证号 | vcardid | varchar(50) |  | 字符串 (String) |
| 4 | pk_mid_dept | 科室 | pk_mid_dept | varchar(20) |  | 来源科室档案 (HpcfDeptVO) |
| 5 | vdeptcode | 科室编码 | vdeptcode | varchar(50) |  | 字符串 (String) |
| 6 | vdeptname | 科室名称 | vdeptname | varchar(50) |  | 字符串 (String) |
| 7 | itype | 医保类型 | itype | varchar(20) |  | 医保类型 (insurancetypeVO) |
| 8 | itypecode | 医保类型编码 | itypecode | varchar(50) |  | 字符串 (String) |
| 9 | itypename | 医保类型名称 | itypename | varchar(50) |  | 字符串 (String) |
| 10 | code | 病人编码 | code | varchar(50) |  | 字符串 (String) |
| 11 | name | 病人姓名 | name | varchar(100) |  | 字符串 (String) |
| 12 | medicalno | 病例号 | medicalno | varchar(30) |  | 字符串 (String) |
| 13 | admission | 住院次数 | admission | int |  | 整数 (Integer) |
| 14 | patientnature | 病人属性 | patientnature | varchar(30) |  | 字符串 (String) |
| 15 | source | 来源 | source | varchar(20) |  | 数据来源 (DataSource) |  | 1=HIS系统; |