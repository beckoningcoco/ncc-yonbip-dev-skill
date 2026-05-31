# |<<

**岗位设置子表 (pd_ppresp_b / nc.vo.pd.basedoc.ppresp.entity.PPRespItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4367.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ppresp_b | 岗位设置明细 | pk_ppresp_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 计划中心最新版本 | pk_org | varchar(20) |  | 组织_业务单元_计划中心 (plancenter) |
| 4 | pk_org_v | 计划中心 | pk_org_v | varchar(20) |  | 组织_业务单元_计划中心版本信息 (plancenter_v) |
| 5 | pk_marbasclass | 物料基本分类编码 | pk_marbasclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 6 | marbasclasscode | 内部码 | marbasclasscode | varchar(50) |  | 字符串 (String) |
| 7 | pk_material | 物料 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 8 | pk_srcmaterial | 物料最新版本 | pk_srcmaterial | varchar(20) |  | 物料基本信息 (material_v) |
| 9 | pk_materialcode | 物料编码 | pk_materialcode | varchar(50) |  | 字符串 (String) |
| 10 | marclasscode | 物料分类编码 | marclasscode | varchar(50) |  | 字符串 (String) |