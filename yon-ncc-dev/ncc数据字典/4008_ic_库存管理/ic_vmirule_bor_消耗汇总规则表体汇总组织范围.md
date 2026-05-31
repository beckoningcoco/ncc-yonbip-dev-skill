# |<<

**消耗汇总规则表体汇总组织范围 (ic_vmirule_bor / nc.vo.ic.vmirule.entity.VmiRuleBodyOrgRangeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3009.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | corgrangeid | 表体汇总组织范围主键 | corgrangeid | char(20) | √ | 主键 (UFID) |
| 2 | ccalbodyid | 库存组织 | ccalbodyid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 3 | cwarehouseid | 仓库 | cwarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |