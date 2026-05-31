# |<<

**交班总结(护士) (uh_ex_connect_ns / com.yonyou.yh.nhis.ex.ns.vo.UhExConnectNsVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6064.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_connect_ns | 主键 | pk_connect_ns | char(20) | √ | 主键 (UFID) |
| 2 | pk_connect_ns | 主键 | pk_connect_ns | char(20) | √ | 主键 (UFID) |
| 3 | pk_connect | 交班记录主键 | pk_connect | varchar(20) | √ | 交接班记录表 (UhExConnect) |
| 4 | pk_pvdept | 患者所在科室 | pk_pvdept | varchar(20) | √ | 患者就诊_科室病区 (pvbannerdept) |
| 5 | pk_pv | 患者主键 | pk_pv | varchar(50) | √ | 字符串 (String) |
| 6 | patient_state | 患者当前状态 | patient_state | int | √ | 患者当前状态 (PatientStateEnum) |  | 1=病危; |