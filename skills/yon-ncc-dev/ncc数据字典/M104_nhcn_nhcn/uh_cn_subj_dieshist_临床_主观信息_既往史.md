# |<<

**临床_主观信息_既往史 (uh_cn_subj_dieshist / com.yonyou.yh.nhis.cn.diag.vo.CNDiseaseHisVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6056.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cnsubjdieshist | 主观信息既往史主键 | pk_cnsubjdieshist | char(20) | √ | 主键 (UFID) |
| 2 | pk_cnsubj | 临床主观信息 | pk_cnsubj | varchar(20) |  | 临床主观信息 (cnsubject) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 5 | pk_pv | 患者就诊 | pk_pv | varchar(20) |  | 患者就诊 (PatiVisitVO) |
| 6 | sortno | 序号 | sortno | int |  | 整数 (Integer) |
| 7 | pk_sym | 症状术语 | pk_sym | varchar(20) |  | 临床主诉术语定义_症状 (complaint) |
| 8 | name_sym | 症状术语名称 | name_sym | varchar(50) |  | 字符串 (String) |
| 9 | pk_diag | 诊断 | pk_diag | varchar(20) |  | 标准诊断编码 (stddiag) |
| 10 | name_dies | 疾病名称 | name_dies | varchar(50) |  | 字符串 (String) |
| 11 | pk_unit_peri | 期间单位主键 | pk_unit_peri | varchar(20) |  | 期间单位(自定义档案) (Defdoc-060207) |
| 12 | dt_unit_peri | 期间单位 | dt_unit_peri | varchar(50) |  | 字符串 (String) |
| 13 | name_unit_peri | 期间单位名称 | name_unit_peri | varchar(50) |  | 字符串 (String) |
| 14 | val_peri | 期间数值 | val_peri | decimal(14, 2) |  | 数值 (UFDouble) |