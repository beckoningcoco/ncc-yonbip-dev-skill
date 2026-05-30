# |<<

**联产品相对系数 (mapub_coprodcoef / nc.vo.mapub.coprodcoef.entity.CoprodcoefHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3590.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ccoprodcoefid | 联产品相对系数 | ccoprodcoefid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 业务单元 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 业务单元版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | cmaterialid | 物料 | cmaterialid | varchar(20) | √ | 物料基本信息 (material_v) |
| 6 | cmaterialvid | 物料版本 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | cbomid | 生产BOM版本 | cbomid | varchar(20) |  | 物料清单 (bd_bom) |
| 8 | crtid | 工艺路线 | crtid | varchar(20) |  | 工艺路线主表 (pd_rt) |
| 9 | pk_elementsystem | 要素体系 | pk_elementsystem | varchar(20) |  | 责任会计_要素体系 (elementsystem) |
| 10 | pk_factorchart | 核算要素表 | pk_factorchart | varchar(20) |  | 要素表 (FactorChart) |
| 11 | ibillstatus | 单据状态 | ibillstatus | int |  | 单据状态 (BillStatusEnum) |  | -1=自由; |