# |<<

**药品详细信息 (bd_uh_pd_2 / nc.vo.drugbd.dataio.DrugBDInfoVO2)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1066.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_info | 药品信息主键 | pk_info | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 4 | code | 物料编码 | code | varchar(40) | √ | 字符串 (String) |
| 5 | name | 物料名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 6 | pk_measdoc_base | 基本包装单位 | pk_measdoc_base | varchar(20) | √ | 计量单位 (measdoc) |
| 7 | factor_fb | 主计量单位和基本包装单位默认1比1 | factor_fb | varchar(50) |  | 字符串 (String) | 1/1 |
| 8 | pk_measdoc_med | 医疗含量单位 | pk_measdoc_med | varchar(20) | √ | 计量单位 (measdoc) |
| 9 | factor_mb | 医疗含量单位和基本包装单位默认1比1 | factor_mb | varchar(50) |  | 字符串 (String) | 1/1 |
| 10 | pk_dosage | 剂型 | pk_dosage | varchar(20) | √ | 药品剂型(自定义档案) (Defdoc-030400) |
| 11 | eu_pois | 毒麻分类 | eu_pois | varchar(20) | √ | 毒麻分类(自定义档案) (Defdoc-030403) |
| 12 | dt_pois | 毒麻分类编码默认00 | dt_pois | varchar(50) |  | 字符串 (String) | 00 |
| 13 | name_pd | 商品名称 | name_pd | varchar(50) |  | 字符串 (String) |
| 14 | name_chem | 化学名称 | name_chem | varchar(200) |  | 多语文本 (MultiLangText) |
| 15 | eu_val | 价值分类 | eu_val | varchar(20) |  | 价值分类(自定义档案) (Defdoc-030405) |
| 16 | pk_anti | 抗菌药分类 | pk_anti | varchar(50) |  | 抗菌药分类 (AntimicrobialClassEnum) |  | 0=非抗菌药; |