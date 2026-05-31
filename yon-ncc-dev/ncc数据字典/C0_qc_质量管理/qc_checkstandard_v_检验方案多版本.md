# |<<

**检验方案多版本 (qc_checkstandard_v / nc.vo.qc.checkstandardv.entity.ChkStdVerisionHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4836.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_checkstandard | 检验方案多版本 | pk_checkstandard | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 质检中心 | pk_org | varchar(20) |  | 组织_业务单元_质检中心 (qccenter) |
| 4 | vchkstandardcode | 检验方案编码 | vchkstandardcode | varchar(50) |  | 字符串 (String) |
| 5 | vchkstandardname | 检验方案名称 | vchkstandardname | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | version | 版本 | version | varchar(20) |  | 字符串 (String) |
| 7 | pk_standardclass | 检验方案分类 | pk_standardclass | varchar(20) |  | 检验方案分类 (qc_standardclass) |
| 8 | pk_qualitylv | 质量等级组 | pk_qualitylv | varchar(20) |  | 质量等级组 (scm_qualitylevel_h) |
| 9 | bsamplebycheckitem | 检验项目确定取样方式 | bsamplebycheckitem | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | pk_checkmode | 取样方式 | pk_checkmode | varchar(20) |  | 取样方式 (qc_checkmode) |
| 11 | bsealflag | 封存 | bsealflag | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | vmemo | 备注 | vmemo | varchar(181) |  | 字符串 (String) |
| 13 | bnewestversion | 是否最新版本 | bnewestversion | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | lastverionpk | 上一版本检验方案pk | lastverionpk | varchar(20) |  | 字符串 (String) |
| 15 | pk_chkstd_origin | 检验方案多版本原始pk | pk_chkstd_origin | varchar(20) |  | 检验方案 (qc_checkstandard) |
| 16 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 17 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 18 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 19 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 20 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 21 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 22 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 23 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 24 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 25 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |