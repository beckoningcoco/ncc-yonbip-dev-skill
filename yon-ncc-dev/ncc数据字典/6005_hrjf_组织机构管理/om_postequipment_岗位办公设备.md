# |<<

**岗位办公设备 (om_postequipment / nc.vo.om.post.PostEquipmentVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3962.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_post_sub | 岗位办公设备 | pk_post_sub | char(20) | √ | 主键 (UFID) |
| 2 | equipmentno | 设备编号 | equipmentno | varchar(50) | √ | 字符串 (String) |
| 3 | equipmentname | 设备名称 | equipmentname | varchar(50) | √ | 字符串 (String) |
| 4 | lastflag | 是否最近记录 | lastflag | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | recordnum | 记录序号 | recordnum | int |  | 整数 (Integer) |
| 6 | equipmentuse | 设备用途 | equipmentuse | varchar(50) |  | 字符串 (String) |
| 7 | pk_post | 岗位 | pk_post | varchar(20) |  | 岗位基本信息 (om_post) |