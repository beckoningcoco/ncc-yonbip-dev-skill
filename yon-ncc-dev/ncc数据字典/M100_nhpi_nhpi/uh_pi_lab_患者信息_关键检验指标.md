# |<<

**患者信息_关键检验指标 (uh_pi_lab / com.yonyou.yh.nhis.pi.ov.vo.PiOvLabVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6196.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_patilab | 患者关键指标主键 | pk_patilab | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_pati | 患者 | pk_pati | varchar(20) |  | 患者基本信息ov (piovpativo) |
| 5 | mcsrc | 信息来源 | mcsrc | int |  | 整数 (Integer) |
| 6 | pk_mctype | 医疗术语类型 | pk_mctype | varchar(20) |  | 医疗术语类型(自定义档案) (Defdoc-060003) |
| 7 | dt_mctype | 医疗术语类型编码 | dt_mctype | varchar(50) |  | 字符串 (String) |
| 8 | pk_mc_lab_pv | 指标_就诊流程 | pk_mc_lab_pv | varchar(20) |  | 基础医疗术语 (MCTermVO) |
| 9 | pk_mc_lab_ehr | 指标_健康档案 | pk_mc_lab_ehr | varchar(20) |  | 基础医疗术语 (MCTermVO) |
| 10 | pk_mc_lab_rhip | 指标_区域平台 | pk_mc_lab_rhip | varchar(20) |  | 基础医疗术语 (MCTermVO) |
| 11 | name_lab | 指标名称 | name_lab | varchar(50) |  | 字符串 (String) |
| 12 | val_lab | 指标数值 | val_lab | varchar(256) |  | 字符串 (String) |
| 13 | unit_lab | 指标单位 | unit_lab | varchar(256) |  | 字符串 (String) |
| 14 | val_lab_std | 标准数值 | val_lab_std | varchar(256) |  | 字符串 (String) |
| 15 | date_lab | 指标日期 | date_lab | char(19) |  | 日期时间 (UFDateTime) |