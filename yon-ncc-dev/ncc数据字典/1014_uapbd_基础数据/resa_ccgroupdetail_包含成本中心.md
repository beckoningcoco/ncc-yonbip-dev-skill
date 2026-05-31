# |<<

**包含成本中心 (resa_ccgroupdetail / nc.vo.resa.costcentergroup.CCGroupdetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4886.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ccgroupdetail | 对象标识 | pk_ccgroupdetail | char(20) | √ | 主键 (UFID) |
| 2 | pk_costcenter | 成本中心 | pk_costcenter | varchar(20) |  | 成本中心 (resacostcenter) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |