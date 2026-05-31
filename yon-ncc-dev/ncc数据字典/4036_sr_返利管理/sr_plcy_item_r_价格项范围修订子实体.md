# |<<

**价格项范围修订子实体 (sr_plcy_item_r / nc.vo.sr.policy.revise.entity.PlcyPrcitemReviseVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5465.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_plcy_prcitem_r | 价格项范围修订子实体 | pk_plcy_prcitem_r | char(20) | √ | 主键 (UFID) |
| 2 | pk_plcy_prcitem | 价格项范围子实体 | pk_plcy_prcitem | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | cpriceitemid | 价格项 | cpriceitemid | varchar(20) |  | 价格项 (prm_pricetype) |
| 5 | brbtbaseflag | 参与返利依据计算 | brbtbaseflag | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | brbtvalueflag | 参与返利值计算 | brbtvalueflag | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | pk_plcy | 返利政策主实体 | pk_plcy | char(20) |  | 主键 (UFID) |