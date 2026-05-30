# |<<

**临床_主观信息_主诉 (uh_cn_subj_prob / com.yonyou.yh.nhis.cn.diag.vo.CNCComplaintVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6057.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cnsubjprob | 主观信息主诉主键 | pk_cnsubjprob | char(20) | √ | 主键 (UFID) |
| 2 | pk_cnsubj | 患者就诊主观信息 | pk_cnsubj | varchar(20) |  | 临床主观信息 (cnsubject) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 5 | pk_pv | 患者就诊 | pk_pv | varchar(20) |  | 患者就诊 (PatiVisitVO) |
| 6 | sortno | 序号 | sortno | int |  | 整数 (Integer) |
| 7 | pk_prob_seve | 程度术语主键 | pk_prob_seve | varchar(20) |  | 程度(自定义档案) (Defdoc-060206) |
| 8 | dt_prob_seve | 程度术语 | dt_prob_seve | varchar(50) |  | 字符串 (String) |
| 9 | name_prob_seve | 程度术语名称 | name_prob_seve | varchar(50) |  | 字符串 (String) |
| 10 | pk_prob_posi | 方位术语主键 | pk_prob_posi | varchar(20) |  | 方位(自定义档案) (Defdoc-060205) |
| 11 | dt_prob_posi | 方位术语 | dt_prob_posi | varchar(50) |  | 字符串 (String) |
| 12 | name_prob_posi | 方位术语名称 | name_prob_posi | varchar(50) |  | 字符串 (String) |
| 13 | pk_prob_body | 部位术语主键 | pk_prob_body | varchar(20) |  | 部位(自定义档案) (Defdoc-060204) |
| 14 | dt_prob_body | 部位术语 | dt_prob_body | varchar(50) |  | 字符串 (String) |
| 15 | name_prob_body | 部位术语名称 | name_prob_body | varchar(50) |  | 字符串 (String) |
| 16 | pk_sym | 症状术语主键 | pk_sym | varchar(20) |  | 临床主诉术语定义_症状 (complaint) |
| 17 | name_sym | 症状术语名称 | name_sym | varchar(50) |  | 字符串 (String) |
| 18 | pk_unit_peri | 期间单位主键 | pk_unit_peri | varchar(20) |  | 期间单位(自定义档案) (Defdoc-060207) |
| 19 | dt_unit_peri | 期间单位 | dt_unit_peri | varchar(50) |  | 字符串 (String) |
| 20 | name_unit_peri | 期间单位名称 | name_unit_peri | varchar(50) |  | 字符串 (String) |
| 21 | val_peri | 期间数值 | val_peri | varchar(14) |  | 字符串 (String) |