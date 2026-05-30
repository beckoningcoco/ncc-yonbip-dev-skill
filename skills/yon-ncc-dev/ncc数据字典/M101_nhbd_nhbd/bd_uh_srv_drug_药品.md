# |<<

**药品 (bd_uh_srv_drug / com.yonyou.yh.nhis.bd.uhsrv.vo.UHSrvDrugVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1113.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srv_drug | 服务药品主键 | pk_srv_drug | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | name_gen | 药品通用名称 | name_gen | varchar(50) | √ | 字符串 (String) |
| 5 | name_cham | 药品化学名称 | name_cham | varchar(50) |  | 字符串 (String) |
| 6 | pk_dosage | 药品剂型 | pk_dosage | varchar(50) | √ | 字符串 (String) |
| 7 | pk_pharm | 药理分类 | pk_pharm | varchar(50) |  | 字符串 (String) |
| 8 | pk_pois | 毒麻分类 | pk_pois | varchar(20) |  | 毒麻分类(自定义档案) (Defdoc-030403) |
| 9 | pk_val | 价值分类 | pk_val | varchar(20) |  | 价值分类(自定义档案) (Defdoc-030405) |
| 10 | pk_anti | 抗生素分类 | pk_anti | varchar(20) |  | 抗菌药分类(自定义档案) (Defdoc-030406) |
| 11 | quan_dosage | 单次剂量_医疗单位 | quan_dosage | decimal(14, 2) | √ | 数值 (UFDouble) |
| 12 | indica | 适应症 | indica | varchar(200) |  | 备注 (Memo) |
| 13 | constr | 禁忌症 | constr | varchar(200) |  | 备注 (Memo) |
| 14 | react | 不良反应 | react | varchar(200) |  | 备注 (Memo) |
| 15 | guide | 药品主要作用及用途 | guide | varchar(200) |  | 备注 (Memo) |
| 16 | dispendmode | 药品分发策略 | dispendmode | varchar(50) |  | 字符串 (String) |
| 17 | pk_srv | 服务 | pk_srv | varchar(50) |  | 字符串 (String) |
| 18 | dt_dosage | 药品剂型编码 | dt_dosage | varchar(50) |  | 字符串 (String) |
| 19 | dt_pharm | 药理分类编码 | dt_pharm | varchar(50) |  | 字符串 (String) |
| 20 | dt_pois | 毒麻分类编码 | dt_pois | varchar(50) |  | 字符串 (String) |
| 21 | dt_val | 价值分类编码 | dt_val | varchar(50) |  | 字符串 (String) |
| 22 | dt_anti | 抗生素分类编码 | dt_anti | varchar(50) |  | 字符串 (String) |
| 23 | dt_muputype | 包装单位取整模式编码 | dt_muputype | varchar(50) |  | 字符串 (String) |
| 24 | pk_muputype | 包装单位取整模式 | pk_muputype | varchar(50) |  | 字符串 (String) |