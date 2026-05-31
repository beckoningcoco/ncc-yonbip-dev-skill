# |<<

**检验方案匹配设置 (qc_chkstdmatch / nc.vo.qc.checkstandardmatch.entity.ChkStdMatchVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4843.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_chkstdmatch | 检验方案匹配主键 | pk_chkstdmatch | char(20) | √ | 主键 (UFID) |
| 2 | pk_marbasclass | 物料分类 | pk_marbasclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 3 | pk_material | 物料编码 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 4 | pk_supplier | 供应商 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 5 | pk_customer | 客户 | pk_customer | varchar(20) |  | 客户基本信息 (customer) |
| 6 | pk_project | 项目 | pk_project | varchar(20) |  | 项目 (project) |
| 7 | pk_checkstandard | 检验方案 | pk_checkstandard | varchar(20) |  | 检验方案 (qc_checkstandard) |
| 8 | bdefaultstd | 默认方案 | bdefaultstd | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | pk_org | 质检中心 | pk_org | varchar(20) |  | 组织_业务单元_质检中心 (qccenter) |
| 10 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 11 | vmarclasscode | 物料分类编码 | vmarclasscode | varchar(40) |  | 字符串 (String) |
| 12 | vinnercode | 物料分类内部吗 | vinnercode | varchar(200) |  | 字符串 (String) |
| 13 | pk_factory | 工厂 | pk_factory | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 14 | pk_factory_v | 工厂多版本 | pk_factory_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 15 | pk_processtype | 工序类型 | pk_processtype | varchar(20) |  | 标准工序 (pd_rc) |
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