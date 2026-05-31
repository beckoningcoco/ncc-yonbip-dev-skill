# |<<

**批次关联明细 (mm_batchbind_b / nc.vo.mmpac.batchass.pick.entity.BatchBindItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3632.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbindbid | 批次关联明细 | cbindbid | char(20) | √ | 主键 (UFID) |
| 2 | cbindid | 批次关联 | cbindid | char(20) |  | 主键 (UFID) |
| 3 | cmaterialoutid | 材料出库单 | cmaterialoutid | varchar(20) |  | 材料出库单表头 (MaterialOutHeadVO) |
| 4 | cmaterialoutbid | 材料出库单行 | cmaterialoutbid | varchar(20) |  | 材料出库单表体 (MaterialOutBodyVO) |
| 5 | vrowno | 行号 | vrowno | varchar(40) |  | 字符串 (String) |
| 6 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 8 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 9 | fbatype | 关联类型 | fbatype | int |  | 批次关联类型 (BindType) | 1 | 1=手工; |