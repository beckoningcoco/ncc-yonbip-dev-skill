# |<<

**订单要素成本 (scaba_generalnab / nc.vo.scaba.costprocess.entity.GeneralnabVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5084.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cgeneralnabid | 订单要素成本 | cgeneralnabid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | ccostcenterid | 成本中心 | ccostcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 6 | vmocode | 订单号 | vmocode | varchar(50) |  | 字符串 (String) |
| 7 | cmaterialid | 产品 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 8 | cmaterialvid | 产品版本 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 9 | cmarcostclassid | 产品成本分类 | cmarcostclassid | varchar(20) |  | 物料成本分类 (marcostclass) |
| 10 | celementid | 核算要素 | celementid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 11 | cprojectid | 产品项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 12 | ccustomerid | 产品客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 13 | cvendorid | 产品供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 14 | cproductorid | 产品生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 15 | intotalmoney | 计入总成本 | intotalmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | intotalmoney_this | 计入总成本-本层 | intotalmoney_this | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | intotalmoney_up | 计入总成本-上层 | intotalmoney_up | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | inabsmoney | 吸收成本 | inabsmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | inabsmoney_this | 吸收成本-本层 | inabsmoney_this | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | inabsmoney_up | 吸收成本-上层 | inabsmoney_up | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | instdmoney | 目标成本 | instdmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | instdmoney_this | 目标成本-本层 | instdmoney_this | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | instdmoney_up | 目标成本-上层 | instdmoney_up | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | innumdiffmoney | 投入量差 | innumdiffmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | innumdiffmoney_this | 投入量差-本层 | innumdiffmoney_this | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | innumdiffmoney_up | 投入量差-上层 | innumdiffmoney_up | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | inpricediffmoney | 投入价差 | inpricediffmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | inpricediffmoney_this | 投入价差-本层 | inpricediffmoney_this | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | inpricediffmoney_up | 投入价差-上层 | inpricediffmoney_up | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | outtotalmoney | 转出总成本 | outtotalmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | outtotalmoney_this | 转出总成本-本层 | outtotalmoney_this | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | outtotalmoney_up | 转出总成本-上层 | outtotalmoney_up | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | outabsmoney | 转出合格品成本 | outabsmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | outabsmoney_this | 转出合格品成本-本层 | outabsmoney_this | decimal(28, 8) |  | 数值 (UFDouble) |
| 35 | outabsmoney_up | 转出合格品成本-上层 | outabsmoney_up | decimal(28, 8) |  | 数值 (UFDouble) |
| 36 | outpricediffmoney | 转出价差 | outpricediffmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 37 | outpricediffmoney_this | 转出价差-本层 | outpricediffmoney_this | decimal(28, 8) |  | 数值 (UFDouble) |
| 38 | outpricediffmoney_up | 转出价差-上层 | outpricediffmoney_up | decimal(28, 8) |  | 数值 (UFDouble) |
| 39 | reldiffmoney | 替代差异 | reldiffmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 40 | reldiffmoney_this | 替代差异-本层 | reldiffmoney_this | decimal(28, 8) |  | 数值 (UFDouble) |
| 41 | reldiffmoney_up | 替代差异-上层 | reldiffmoney_up | decimal(28, 8) |  | 数值 (UFDouble) |
| 42 | otherdiffmoney | 其他差异 | otherdiffmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 43 | otherdiffmoney_this | 其他差异-本层 | otherdiffmoney_this | decimal(28, 8) |  | 数值 (UFDouble) |
| 44 | otherdiffmoney_up | 其他差异-上层 | otherdiffmoney_up | decimal(28, 8) |  | 数值 (UFDouble) |
| 45 | batchdiffmoney | 批量差异 | batchdiffmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 46 | batchdiffmoney_this | 批量差异-本层 | batchdiffmoney_this | decimal(28, 8) |  | 数值 (UFDouble) |
| 47 | batchdiffmoney_up | 批量差异-上层 | batchdiffmoney_up | decimal(28, 8) |  | 数值 (UFDouble) |
| 48 | closediffmoney | 关闭差异 | closediffmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 49 | closediffmoney_this | 关闭差异-本层 | closediffmoney_this | decimal(28, 8) |  | 数值 (UFDouble) |
| 50 | closediffmoney_up | 关闭差异-上层 | closediffmoney_up | decimal(28, 8) |  | 数值 (UFDouble) |
| 51 | remaindiffmoney | 残差 | remaindiffmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 52 | remaindiffmoney_this | 残差-本层 | remaindiffmoney_this | decimal(28, 8) |  | 数值 (UFDouble) |
| 53 | remaindiffmoney_up | 残差-上层 | remaindiffmoney_up | decimal(28, 8) |  | 数值 (UFDouble) |
| 54 | wastemoney | 转出废品成本 | wastemoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 55 | wastemoney_this | 转出废品成本-本层 | wastemoney_this | decimal(28, 8) |  | 数值 (UFDouble) |
| 56 | wastemoney_up | 转出废品成本-上层 | wastemoney_up | decimal(28, 8) |  | 数值 (UFDouble) |
| 57 | outmoney | 转出成本 | outmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 58 | outmoney_this | 转出成本-本层 | outmoney_this | decimal(28, 8) |  | 数值 (UFDouble) |
| 59 | outmoney_up | 转出成本-上层 | outmoney_up | decimal(28, 8) |  | 数值 (UFDouble) |
| 60 | wastehousemoney | 入库报废成本 | wastehousemoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 61 | ccostobjectid | 成本对象 | ccostobjectid | varchar(20) |  | 成本对象 (cm_costobject) |
| 62 | cmaincostobjectid | 主成本对象 | cmaincostobjectid | varchar(20) |  | 成本对象 (cm_costobject) |
| 63 | pk_accbook | 核算账簿 | pk_accbook | varchar(20) |  | 账簿_核算账簿 (accbook) |
| 64 | pk_setofbook | 账簿类型 | pk_setofbook | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 65 | pk_profitcenter | 利润中心 | pk_profitcenter | varchar(20) |  | 利润中心 (profitcenter) |
| 66 | orderclosed | 订单是否已关闭 | orderclosed | char(1) |  | 布尔类型 (UFBoolean) |
| 67 | ccostcomponentid | 成本组件 | ccostcomponentid | varchar(20) |  | 成本组件 (bd_costcomponent) |
| 68 | pk_org_co | 业务单元 | pk_org_co | varchar(20) |  | 组织 (org) |
| 69 | nplanputnum | 生产数量 | nplanputnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 70 | nhinnum | 累计入库主数量 | nhinnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 71 | fproducttype | 产品类型 | fproducttype | int |  | 产品类型 (ProductTypeEnum) |  | 1=主产品; |