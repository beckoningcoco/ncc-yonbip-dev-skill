# |<<

**生产报告交易类型 (mm_wrtranstype / nc.vo.mmpac.wr.entity.WrTransTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3804.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wrtranstype | 生产报告交易类型主键 | pk_wrtranstype | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | ctrantypeid | 交易类型主键 | ctrantypeid | varchar(50) |  | 字符串 (String) |
| 4 | vtrantypecode | 生产报告交易类型编码 | vtrantypecode | varchar(50) |  | 字符串 (String) |
| 5 | bsavetoaudit | 保存即审批 | bsavetoaudit | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | bcreateinvbatch | 完工报产时产生库存批次号 | bcreateinvbatch | char(1) |  | 布尔类型 (UFBoolean) |