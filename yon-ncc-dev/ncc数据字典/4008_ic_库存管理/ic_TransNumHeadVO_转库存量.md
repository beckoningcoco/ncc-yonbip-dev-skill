# |<<

**转库存量 (ic_TransNumHeadVO / nc.vo.ic.m4k.entity.TransNumHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2997.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | chid | 表头主键 | chid | char(20) | √ | 主键 (UFID) |
| 2 | cwarehouseid | 仓库 | cwarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 3 | pk_org | 库存组织 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | cstateid | 库存状态 | cstateid | varchar(20) |  | 主键 (UFID) |
| 5 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 6 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 7 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 8 | cffileid | 特征码 | cffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 9 | atpnum | 可用量 | atpnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | cmaterialvid | 物料编码 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 11 | bsplitbybatch | 批次展开 | bsplitbybatch | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | bsplitbyasunit | 辅计量单位展开 | bsplitbyasunit | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | bsplitbyvfree | 自由辅助属性展开 | bsplitbyvfree | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | bsplitbylocation | 货位展开 | bsplitbylocation | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | bsplitbystate | 库存状态展开 | bsplitbystate | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | bsplitbyproject | 项目展开 | bsplitbyproject | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | bsplitbyvendor | 供应商展开 | bsplitbyvendor | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | bsplitbyproductor | 生产厂商展开 | bsplitbyproductor | char(1) |  | 布尔类型 (UFBoolean) |
| 19 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 20 | bsplitbycasscustid | 客户展开 | bsplitbycasscustid | char(1) |  | 布尔类型 (UFBoolean) |
| 21 | casscustid | 客户 | casscustid | varchar(20) |  | 客户基本信息 (customer) |
| 22 | bsplitbycffileid | 特征码展开 | bsplitbycffileid | char(1) |  | 布尔类型 (UFBoolean) |