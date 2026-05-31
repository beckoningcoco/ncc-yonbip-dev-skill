# |<<

**患者健康信息 (uh_pi_health / com.yonyou.yh.nhis.pi.pati.vo.PatiHealthVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6190.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_patihealth | 患者健康信息主键 | pk_patihealth | char(20) | √ | 主键 (UFID) |
| 2 | pk_pati | 患者主键 | pk_pati | varchar(20) |  | 患者基本信息 (pati) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_blood_abo | ABO血型 | pk_blood_abo | varchar(20) |  | 血型(自定义档案) (Defdoc-000004) |
| 6 | pk_blood_rh | Rh血型 | pk_blood_rh | varchar(20) |  | RH阴性(自定义档案) (Defdoc-000005) |
| 7 | dt_blood_abo | ABO血型编码 | dt_blood_abo | varchar(50) |  | 字符串 (String) |
| 8 | dt_blood_rh | Rh血型编码 | dt_blood_rh | varchar(50) |  | 字符串 (String) |