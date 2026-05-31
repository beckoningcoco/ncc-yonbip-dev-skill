# |<<

**卷积特例物料 (sca_convscheme_special / nc.vo.sca.costsimulation.entity.ConvSchemeSpecialVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5045.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | specialmatid | 卷积特例物料 | specialmatid | char(20) | √ | 主键 (UFID) |
| 2 | pk_convscheme | 卷积方案 | pk_convscheme | char(20) |  | 主键 (UFID) |
| 3 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 4 | cmaterialvid | 物料版本 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 5 | ccosttypeid | 成本类型 | ccosttypeid | varchar(20) |  | 成本类型 (mapub_costtype) |
| 6 | vmatpricesource | 材料价格来源 | vmatpricesource | int |  | 价格来源 (iPriceSourceEnum) | 1 | 1=计划价; |