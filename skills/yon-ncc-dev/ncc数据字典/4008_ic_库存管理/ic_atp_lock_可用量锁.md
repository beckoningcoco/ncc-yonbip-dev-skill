# |<<

**可用量锁 (ic_atp_lock / nc.vo.ic.atp.entity.AtpDimVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2880.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | catplockid | 可用量锁 | catplockid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | cwarehouseid | 仓库 | cwarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 5 | cmaterialoid | 物料 | cmaterialoid | varchar(20) |  | 物料基本信息 (material_v) |
| 6 | pk_batchcode | 批次 | pk_batchcode | varchar(20) |  | 批次档案 (BatchcodeVO) |
| 7 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 8 | vhashcode | 散列码 | vhashcode | varchar(32) |  | 字符串 (String) |
| 9 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 10 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 11 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 12 | casscustid | 客户 | casscustid | varchar(20) |  | 客户基本信息 (customer) |
| 13 | cffileid | 特征码 | cffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 14 | vfree1 | 物料自由属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 15 | vfree2 | 物料自由属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 16 | vfree3 | 物料自由属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 17 | vfree4 | 物料自由属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 18 | vfree5 | 物料自由属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 19 | vfree6 | 物料自由属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 20 | vfree7 | 物料自由属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 21 | vfree8 | 物料自由属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 22 | vfree9 | 物料自由属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 23 | vfree10 | 物料自由属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |